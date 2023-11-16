package org.example.task1;

import java.util.Scanner;

public class YearsLived {
    public void printAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 120 включительно:");
        int year = scanner.nextInt();

        scanner.close();

        if ((year >= 11 && year <= 14) || (year >= 111 && year <= 114)) {
            System.out.println("Вам " + year + " лет");
        } else if (year % 10 == 1) {
            System.out.println("Вам " + year + " год");
        } else if (year % 10 == 2 || year % 10 == 3 || year % 10 == 4) {
            System.out.println("Вам " + year + " года");
        } else {
            System.out.println("Вам " + year + " лет");
        }
    }
}