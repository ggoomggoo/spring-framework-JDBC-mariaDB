package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcMariadbMysqlApplication {

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcMariadbMysqlApplication.class, args);
		
		run();
		
	}
	
	/**
	 * 
	 */
	public static void run() {
		
		Emp kim = new Emp();
		kim.setEmpno(new Long(1));
		kim.setEname("dongsu");
		System.out.println(kim.toString());
		
	}
}
