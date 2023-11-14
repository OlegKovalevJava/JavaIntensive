package org.example.task2;

import java.util.Scanner;

public class House {

    public void getInfoAboutApartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей:");
        int floorsCount = scanner.nextInt();

        System.out.println("Введите количество подъездов:");
        int entranceCount = scanner.nextInt();

        System.out.println("Введите номер интересующей вас квартиры:");
        int apartmentNumber = scanner.nextInt();

        scanner.close();

        int totalApartmentsEntrance = floorsCount * 4;
        int totalApartmentsQuantity = entranceCount * totalApartmentsEntrance;

        int countEntrance = 0;

        for (int i = 1; i <= entranceCount; i++) {
            if (apartmentNumber <= totalApartmentsEntrance) {
                countEntrance = i;
                break;
            }
            totalApartmentsEntrance = totalApartmentsEntrance * 2;
        }

        if (apartmentNumber > totalApartmentsQuantity) {
            System.out.println("Квартиры с таким номером в доме нет");
        } else if (apartmentNumber % 4 == 0) {
            System.out.println(apartmentNumber + " кв - " + countEntrance + " подъезд," +
                    " справа от лифта, вправо");
        } else if (apartmentNumber % 4 == 1) {
            System.out.println(apartmentNumber + " кв - " + countEntrance + " подъезд," +
                    " слева от лифта, влево");
        } else if (apartmentNumber % 4 == 2) {
            System.out.println(apartmentNumber + " кв - " + countEntrance + " подъезд," +
                    " слева от лифта, вправо");
        } else {
            System.out.println(apartmentNumber + " кв - " + countEntrance + " подъезд," +
                    " справа от лифта, влево");
        }
    }
}