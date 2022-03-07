package com.example.UseGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootApplication
public class UseGitApplication {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException {
		SpringApplication.run(UseGitApplication.class, args);

		Class<Girl> girlClass = Girl.class;

		/**
		 * Su dung getDeclaredMethods de lay ra nhung method cua class va cha no.
		 */
		Method[] methods = girlClass.getDeclaredMethods();
		for (Method method:
			 methods) {
			System.out.println();
			System.out.println("Method: " + method.getName());
			System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
		}

		/**
		 * Lay ra method ten la setName va co 1 tham so truyen vao
		 * => chinh la: setName(String name)
		 */
		Method methodSetName = girlClass.getMethod("setName", String.class);
		/**
		 * Bay gio methodSetName se dai dien cho method setName(String name) cua moi object co class la Girl
		 */

		Girl girl = new Girl();
		/**
		 * Thuc hien ham setName() tren doi tuong girl, gia tri truyen vao la "Ngoc Trinh"
		 */
		methodSetName.invoke(girl,"Ngoc Trinh");
		System.out.println(girl);
	}
}
