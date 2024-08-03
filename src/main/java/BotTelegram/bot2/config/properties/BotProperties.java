package BotTelegram.bot2.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties (prefix = "bot")
public record BotProperties(String name, String token) {

}
