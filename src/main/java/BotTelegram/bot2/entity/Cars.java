package BotTelegram.bot2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Cars {
    @Id
    private Long id;
    private String category;
    private String name;
    private String hp;

}
