package com.example.UseGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UseGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseGitApplication.class, args);
		calculate(10);
		System.out.println("khoa pub");
	}

	public static void calculate(int number){
		System.out.println(number * 3);
	}

}
