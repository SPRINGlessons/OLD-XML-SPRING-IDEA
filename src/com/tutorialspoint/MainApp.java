// This Project created by Anton Romanov (www.antonromanov.com) 10.01.2018 at 16:11
// Source URL - http://www.w3ii.com/spring/spring_hello_world_example.html
// Git Hub repo - https://github.com/SPRINGlessons/OLD-XML-SPRING-IDEA and git@github.com:SPRINGlessons/OLD-XML-SPRING-IDEA.git


package com.tutorialspoint;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
    }



}
