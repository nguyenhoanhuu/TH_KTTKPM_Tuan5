package com.se.springbootdemocrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

//
//FROM openjdk:11.0.16
//WORKDIR /zalo-deploy
//COPY ./target/21-jpa-crud-0.0.1-SNAPSHOT.jar /zalo-deploy
//COPY . /zalo-deploy
//EXPOSE 8080
//CMD ["java","-jar","21-jpa-crud-0.0.1-SNAPSHOT.jar"]