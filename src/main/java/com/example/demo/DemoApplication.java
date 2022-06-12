package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		demoNullable(null);

		SpringApplication.run(DemoApplication.class, args);
	}

	private static void demoNullable (@Nullable Object o) {
		System.out.println(Optional.ofNullable(o).orElse(""));
	}

}
