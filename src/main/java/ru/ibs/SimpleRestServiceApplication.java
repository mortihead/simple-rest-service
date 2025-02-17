package ru.ibs;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.ibs"})
@Slf4j
public class SimpleRestServiceApplication {
	// Логгер для записи в базу данных
	private static final Logger eventLogger = LogManager.getLogger("DatabaseLogger");

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestServiceApplication.class, args);
	}

}
