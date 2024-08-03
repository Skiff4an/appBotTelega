package BotTelegram.bot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Bot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bot2Application.class, args);
	}

}
