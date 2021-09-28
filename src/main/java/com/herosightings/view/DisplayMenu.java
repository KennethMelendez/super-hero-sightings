package com.herosightings.view;

import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DisplayMenu {

    @Autowired
    private ConsoleIO consoleIO = new ConsoleIOImpl();

    public void welcomeMessage() {
        consoleIO.print("=== Welcome to the Super Hero Sightings Application ===");
        consoleIO.print("Have you seen a sighting today?");
    }

    public ArrayList<String> menuItems() {
        return new ArrayList<>(
                Arrays.asList("Test",
                              "Test2"));
    }

}
