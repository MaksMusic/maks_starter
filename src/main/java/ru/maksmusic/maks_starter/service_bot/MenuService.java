package ru.maksmusic.maks_starter.service_bot;

public class MenuService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMenuMessage() {
        System.out.println(message);
    }
}