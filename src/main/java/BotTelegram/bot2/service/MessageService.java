package BotTelegram.bot2.service;


import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {

    private final CarsService carsService;

    public MessageService(CarsService carsService) {
        this.carsService = carsService;
    }

    public SendMessage messageReceiver(Update update) {
       if (update.hasMessage() && update.getMessage().hasText()) {
           var text = update.getMessage().getText();
           var chatId = update.getMessage().getChatId();
           var name = update.getMessage().getChat().getFirstName();

           String responseText;
           switch (text) {
               case "/start" -> responseText = String.format("Привет, %s! ",name);
               case "/stop" -> responseText = String.format("Пока, %s! ",name);
               case "/random" -> responseText = carsService.getRandomCar("Sport").getName();
               default -> responseText = "Не понял че ты сказал, давай заново";
           }
           var message = new SendMessage();
           message.setChatId(chatId);
           message.setText(responseText);
           return message;

       }
       return null;
    }

}
