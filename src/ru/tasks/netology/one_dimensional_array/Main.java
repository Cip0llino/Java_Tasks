package ru.tasks.netology.one_dimensional_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sumProducts = 0;
        int productNumber = 0;
        int productCount = 0;
        int currentPrice = 0;
        int[] prices = {100, 200, 300};
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] arrProductCount = new int[products.length];
        int[] arrSumPrices = new int[products.length];


        for (int i = 0; i < products.length; i++) {
            int ordinalNumber = i + 1;
            System.out.println(ordinalNumber + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) break;
            String[] enteredNumberUser = inputString.split(" ");
            productNumber = Integer.parseInt(enteredNumberUser[0]) - 1;
            productCount = Integer.parseInt(enteredNumberUser[1]);
            currentPrice = prices[productNumber];

            arrProductCount[productNumber] += productCount;
            arrSumPrices[productNumber] += (productCount * prices[productNumber]);

            sumProducts += productCount * currentPrice;
        }

        System.out.println("Ваша корзина:");
        System.out.printf("|%7s | %7s | %7s | %7s |%n", "Наименование товара", "Количество", "Цена/за ед.", "Общая стоимость");
        for (int i = 0; i < products.length; i++) {
        System.out.printf("|%19s | %10s | %11s | %15s | %n", products[i],  arrProductCount[i], prices[i],  arrSumPrices[i]);
        }
        System.out.println("Итого " + sumProducts);
    }
    
}
