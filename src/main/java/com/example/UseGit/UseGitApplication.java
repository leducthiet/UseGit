package com.example.UseGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootApplication
public class UseGitApplication {

	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException, InstantiationException {
		SpringApplication.run(UseGitApplication.class, args);

		Class<Girl> girlClass = Girl.class;
		System.out.println("Class: " + girlClass.getSimpleName());
		/**
		 * Lay ra toan bo constructor cua class nay
		 */
		System.out.println("Constructors: " + Arrays.toString(girlClass.getConstructors()));

		/**
		 * Tao ra mot object Girl tu class. (Khoi tao khong tham so)
		 */
		Girl girl1 = girlClass.newInstance();
		System.out.println("Girl1: " + girl1);

		/**
		 * Lay ra ham constructor voi tham so la 1 string
		 * Chinh la -> public Girl(String name){}
		 */
		Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class);
		Girl girl2 = girlConstructor.newInstance("Ngoc Trinh");
		System.out.println("Girl2: " + girl2);
	}
}
