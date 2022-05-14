package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Horse horse = context.getBean("horse" , Horse.class);
        System.out.println(horse);
        horse.animalMinus();
        horse.animalPlus();


        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName() + " " + person.getAge() + " "+ person.getHorse());
    }
}
