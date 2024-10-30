package ru.maksmusic.maks_starter.service_bot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Configuration
@EnableConfigurationProperties(BotServiceProperties.class) // Подключение класса свойств
public class MenuServiceAutoConfiguration {

    private final BotServiceProperties properties;

    public MenuServiceAutoConfiguration(BotServiceProperties properties) {
        this.properties = properties;
    }

    @Bean
    public MenuService menuService() {
        MenuService menuService = new MenuService();
        menuService.setMessage(properties.getMessage()); // Передаем сообщение из свойств
        return menuService;
    }
}
