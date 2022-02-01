package ru.tasks.netology.assistant_tax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int earnings = 0;
        int spendings = 0;
        Scanner scanner = new Scanner(System.in);
        String taxSixPercentInfo = "УСН доходы"; // УСН доходы - налог 6% от доходов;
        String taxFifteenPercentInfo = "УСН доходы минус расходы"; // УСН доходы минус расходы - налог 15% от разницы доходов и расходов.

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneySum1 = scanner.nextLine(); // Не используйте тут nextInt (!)
                    int moneySumOneOperation = Integer.parseInt(moneySum1);
                    earnings += moneySumOneOperation;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneySum2 = scanner.nextLine();
                    int moneySumTwoOperation = Integer.parseInt(moneySum2);
                    spendings += moneySumTwoOperation;
                    break;
                case 3:
                    int taxFifteenPercent = taxEarningsMinusSpendings(earnings, spendings);
                    int taxSixPercent = incomeTaxOfSixPercent(earnings);
                    if (taxSixPercent < taxFifteenPercent)
                        printInfoTax(taxSixPercentInfo, taxSixPercent, taxFifteenPercent);
                    else printInfoTax(taxFifteenPercentInfo, taxFifteenPercent, taxSixPercent);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax < 0) tax = 0;
        return tax;
    }

    public static int incomeTaxOfSixPercent(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax < 0) tax = 0;
        return tax;
    }

    public static void printInfoTax(String taxPercent, int yourTaxSystem, int otherTaxSystem) {
        System.out.println("Мы советуем вам " + taxPercent);
        System.out.println("Ваш налог составит: " + yourTaxSystem + " рублей");
        System.out.println("Налог на другой системе: " + otherTaxSystem + " рублей");
        System.out.println("Экономия: " + (otherTaxSystem - yourTaxSystem) + " рублей");
    }

}

