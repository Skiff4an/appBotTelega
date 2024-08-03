package BotTelegram.bot2.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CarsRequest {
    private String category;
    private String name;
    private String hp;
}
