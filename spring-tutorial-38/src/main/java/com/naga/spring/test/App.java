package com.naga.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/naga/spring/test/beans/beans.xml");
		
		Robot robot = (Robot)context.getBean("robot");
		
		robot.speak();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
