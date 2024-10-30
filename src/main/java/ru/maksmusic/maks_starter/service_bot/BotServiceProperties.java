package ru.maksmusic.maks_starter.service_bot;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bot.service") // Префикс для свойств
public class BotServiceProperties {
    private String message = "Hello from MyService!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
