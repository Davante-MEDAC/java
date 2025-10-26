package com.davante.app;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        Integer age = sc.nextInt(10);

        Persona persona = new Persona(name, age);

        System.out.println("Hello, " + persona.getName() + "! You are " + persona.getAge() + " years old.");
    }
}
