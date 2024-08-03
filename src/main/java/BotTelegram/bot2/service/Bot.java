package BotTelegram.bot2.service;

import BotTelegram.bot2.config.properties.BotProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
@Component
@RequiredArgsConstructor
public class Bot extends TelegramLongPollingBot {

    private final BotProperties botProperties;
    private final MessageService messageService;
    @Override
    public String getBotUsername() {
        return botProperties.name();
    }

    @Override
    public String getBotToken() {
        return botProperties.token();
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
            SendMessage sendMessage = messageService.messageReceiver(update);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error("Возникли проблемисы");
        }
    }
}
