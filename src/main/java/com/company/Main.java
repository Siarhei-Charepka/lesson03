package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int c = calculator.add(5, 5);
        System.out.println(c);
        int d = calculator.minus(10, 10);
        System.out.println(d);
        long f = calculator.multiply(10, 10);
        System.out.println(f);
        double j = calculator.division(10, 10);
        System.out.println(j);


        // Game
        System.out.println("Введите число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int compNumber = (int) (Math.random()* 10);

        if (number == compNumber) {
            System.out.println("Комп угадал ваше число ");}
        else {System.out.println("Комп не угадал ваше число");}

    }
}