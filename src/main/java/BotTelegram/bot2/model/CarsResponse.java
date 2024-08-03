package BotTelegram.bot2.model;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CarsResponse {
    private String category;
    private String name;
    private String hp;
}
