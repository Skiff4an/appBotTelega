package BotTelegram.bot2.config;

import BotTelegram.bot2.config.interceptor.UserNameInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor

public class InterceptorConfig implements WebMvcConfigurer {
    private final UserNameInterceptor userNameInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userNameInterceptor);
    }
}
