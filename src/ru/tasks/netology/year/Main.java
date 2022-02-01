package ru.tasks.netology.year;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int leapYear = 366;
        int notLeapYear = 365;
        int resultYear;

        while (true) {
            System.out.println("Введите год и количество дней в формате yyyy число");
            int year = scanner.nextInt();
            int numder = scanner.nextInt();
            boolean resultCheckLeapYear = checkLeapYear(year);

            if (resultCheckLeapYear && numder == leapYear || !resultCheckLeapYear && numder == notLeapYear){
                count++;
            } else {
                resultYear = resultCheckLeapYear ? leapYear : notLeapYear;
                System.out.println("Неправильно! В этом году " + resultYear +" дней!");
                System.out.println("Набрано очков: " + count);
                break;
            }
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
