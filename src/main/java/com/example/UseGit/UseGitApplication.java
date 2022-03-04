package com.example.UseGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UseGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseGitApplication.class, args);
		/**
		 * Sau đây là một vài câu lệnh java simple.
		 */

		calculate(5);
	}

	public static void calculate(int number){
		System.out.println(number * 2);
	}

}
