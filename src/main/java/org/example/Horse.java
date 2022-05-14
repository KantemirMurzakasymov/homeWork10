package org.example;

public class Horse implements IAnimal{

    private String name;
    private String gender;
    private String color;
    private short age;

    public Horse() {
    }

    public Horse(String name, String gender, String color, short age) {
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("Plus Method is working ");
    }

    @Override
    public void animalMinus() {
        System.out.println("Minus Method is working ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
