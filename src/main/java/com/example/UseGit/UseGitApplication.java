package com.example.UseGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;

@SpringBootApplication
public class UseGitApplication {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		SpringApplication.run(UseGitApplication.class, args);

		/**
		 * Khoi tao doi tuong Girl
		 */
		Girl girl = new Girl();
		girl.setName("Ngoc Trinh");

		/**
		 * Lay ra tat ca field cua object
		 */
		for (Field field:
			 girl.getClass().getDeclaredFields()) {
			System.out.println();
			System.out.println("Field:" + field.getName());
			System.out.println("Type" + field.getType());
		}

		/**
		 * Phan chinh
		 */
		/**
		 * Lay ra field co ten 'name' (neu khong tim thay, no se ban NoSuchFieldException)
		 */
		Field nameField = girl.getClass().getDeclaredField("name");
		/**
		 * Cho phep truy cap tam thoi.(Vi no dang la private ma)
		 */
		nameField.setAccessible(true);

		/**
		 * Bay gio cai "nameField" dai dien cho thuoc tinh "name" cua moi object co class Girl.
		 * Thay gia tri moi cua girl bang nameField
		 */
		nameField.set(girl, "Sexy Pig");

		System.out.println(girl);

	}
}
