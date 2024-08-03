package BotTelegram.bot2.config;


import BotTelegram.bot2.config.interceptor.UserNameInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class JpaConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable(UserNameInterceptor.currentUser.get()).or(() -> Optional.of("SYSTEM"));
    }
}
