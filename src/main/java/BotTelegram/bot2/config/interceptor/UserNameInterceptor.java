package BotTelegram.bot2.config.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component

public class UserNameInterceptor implements HandlerInterceptor {
    public static  final ThreadLocal<String> currentUser = new ThreadLocal<>();

    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        String currentUserName = request.getHeader("X-User-Name");
        currentUser.set(currentUserName);
        return true;
    }
    @Override
    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response, final Object handler, final Exception ex) throws Exception {
        currentUser.remove();
    }
}
