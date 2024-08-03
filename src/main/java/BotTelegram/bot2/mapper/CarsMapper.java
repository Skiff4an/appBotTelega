package BotTelegram.bot2.mapper;

import BotTelegram.bot2.entity.Cars;
import BotTelegram.bot2.model.CarsResponse;
import org.mapstruct.Mapper;

@Mapper
public interface CarsMapper {
    CarsResponse carsToCarsResponse(Cars cars);
}
