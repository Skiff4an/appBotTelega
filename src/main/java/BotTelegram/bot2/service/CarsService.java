package BotTelegram.bot2.service;

import BotTelegram.bot2.entity.Cars;
import BotTelegram.bot2.mapper.CarsMapper;
import BotTelegram.bot2.model.CarsRequest;
import BotTelegram.bot2.model.CarsResponse;
import BotTelegram.bot2.repository.CarsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarsService {
    private final CarsRepository carsRepository;
    private final CarsMapper carsMapper;

    public void createNewCar(CarsRequest carsRequest) {
        var newCar = new Cars()
                .setCategory(carsRequest.getCategory())
                .setName(carsRequest.getName())
                .setHp(carsRequest.getHp());
        carsRepository.save(newCar);
    }

    public CarsResponse getRandomCar(String category) {
        var randomByCategory = carsRepository.findRandomByCategory(category)
                .orElseThrow(() -> new RuntimeException("No cars!"));
        return carsMapper.carsToCarsResponse(randomByCategory);
    }
}
