package org.example;

public class Person {

    private String name;
    private short age;
    private Horse horse;

    public Person() {
    }

    public Person(String name, short age) {
        this.name = name;
        this.age = age;

    }

    public Person(Horse horse) {
        this.horse = horse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", horse=" + horse +
                '}';
    }
}
