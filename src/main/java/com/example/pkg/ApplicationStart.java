package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Point p = (Point)applicationContext.getBean("Point10");
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
