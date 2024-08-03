package BotTelegram.bot2.api;


import BotTelegram.bot2.model.CarsRequest;
import BotTelegram.bot2.model.CarsResponse;
import BotTelegram.bot2.service.CarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {
    private final CarsService carService;

    @PostMapping
    public void createNewCar(@RequestBody CarsRequest carsRequest) {
        carService.createNewCar(carsRequest);
    }
    @GetMapping("random")
    public CarsResponse getRandomCar(@RequestParam("category")String category){
        return carService.getRandomCar(category);
    }
    @GetMapping
    public String healthCheck() {
        return "OK";
    }
}
