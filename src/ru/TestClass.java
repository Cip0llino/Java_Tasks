package ru;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class TestClass {

    public static class Human {
         String name;
         int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello(){
            System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    public static void main(String[] args) {
        Human human = new Human("Nikolai", 34);
        human.sayHello();
    }

}