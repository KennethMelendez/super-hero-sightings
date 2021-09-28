package com.herosightings.herosightings;

import com.herosightings.controllers.HerosightingsController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.herosightings.controllers"})
public class HerosightingsApplication implements CommandLineRunner {

	@Autowired
	HerosightingsController herosightingsController;

	public static void main(String[] args) {
		SpringApplication.run(HerosightingsApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception {
		herosightingsController.run();
	}

}
