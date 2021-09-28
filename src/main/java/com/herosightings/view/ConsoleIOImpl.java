package com.herosightings.view;

import org.springframework.stereotype.Component;

@Component("consoleIO")
public class ConsoleIOImpl implements ConsoleIO{
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readMessage(String message) {
        return System.console().readLine(message);
    }
}
