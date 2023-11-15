package org.example.task2;

import java.util.Scanner;

public class House {

    public void getInfoAboutApartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей:");
        int floorsQuantity = scanner.nextInt();

        System.out.println("Введите количество подъездов:");
        int entrancesQuantity = scanner.nextInt();

        System.out.println("Введите номер интересующей вас квартиры:");
        int apartmentNumber = scanner.nextInt();

        scanner.close();

        final int totalApartmentsFloor = 4; // квартир на этаже фиксированное количество
        int totalApartmentsEntrance = floorsQuantity * totalApartmentsFloor; // определяем кол-во квартир в подъезде
        int totalApartmentsQuantity = entrancesQuantity * totalApartmentsEntrance; // определяем кол-во квартир в доме
        // определяем номер подъезда
        int entranceNumber = 0;

        for (int i = 1; i <= entrancesQuantity; i++) {
            if (apartmentNumber <= totalApartmentsEntrance) {
                entranceNumber = i;
                break;
            }
            totalApartmentsEntrance = totalApartmentsEntrance * 2;
        }
        // определяем есть ли квартира в доме
        if (apartmentNumber < 1 || apartmentNumber > totalApartmentsQuantity) {
            System.out.println("Квартиры с таким номером в доме нет");
            return;
        }
        // определяем расположение квартиры относительно лифта
        String apartmentLocation = switch (apartmentNumber % totalApartmentsFloor) {
            case (0) -> "справа от лифта, вправо";
            case (1) -> "слева от лифта, влево";
            case (2) -> "слева от лифта, вправо";
            case (3) -> "справа от лифта, влево";
            default -> "";
        };
        //определяем номер подъезда
        int floorNumber;

        if (apartmentNumber % totalApartmentsFloor == 0) {
            floorNumber = (apartmentNumber / totalApartmentsFloor) - floorsQuantity * (entranceNumber - 1);
        } else {
            floorNumber = (apartmentNumber / totalApartmentsFloor + 1) - floorsQuantity * (entranceNumber - 1);
        }

        System.out.println(apartmentNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, "
                + apartmentLocation);
    }
}