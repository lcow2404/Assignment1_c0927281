package com.example.assignment;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        try {
            person.changeDogsName("Buddy");
        } catch (RuntimeException e) {
            System.out.println("Unable to change dog's name: " + e.getMessage());
        }
    }
}
