package ru.tasks;

public class Human {
    static String name;
    static int age;

    public Human(String name, int age){
         name = this.name;
         age = this.age;
    }
    public void sayHello(){
        System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет.");
    }

    public static void main(String[] args) {
        Human human = new Human("Nikolai", 34);
        human.sayHello();
    }
}
