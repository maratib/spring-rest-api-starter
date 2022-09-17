package com.example.demo;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class DemoApplication {

	@Value("${server.port}")
	private int serverPort;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct()
	public void started() throws IOException {
		System.out.println("Application started at port : " + serverPort);
	}

	@PreDestroy
	public void onExit() {
		System.out.println("Exiting app...");
	}

}