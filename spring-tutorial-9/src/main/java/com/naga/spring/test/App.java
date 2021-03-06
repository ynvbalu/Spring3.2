package com.naga.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("com/naga/spring/test/beans/beans.xml");

    Person person = (Person) context.getBean("person");
    person.speak();

    Address address = (Address) context.getBean("address");
    System.out.println(address);

    System.out.println(person);

    ((ClassPathXmlApplicationContext) context).close();
  }

}
