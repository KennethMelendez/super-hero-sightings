package com.herosightings.controllers;

import com.herosightings.view.ConsoleIO;
import com.herosightings.view.ConsoleIOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.Console;

@Component
@ComponentScan({"com.herosightings.view"})
public class HerosightingsController {

    @Autowired
    ConsoleIO consoleIO = new ConsoleIOImpl();

    public void run(){
        consoleIO.print("Hello from the controller");
    }
}
