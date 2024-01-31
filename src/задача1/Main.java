package задача1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод чисел a и b
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

            // Сравнение чисел и вывод результата
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }

            // Операции сложения, вычитания, деления и умножения
            int sum = a + b;
            int difference = a - b;
            int division = a / b;
            int multiplication = a * b;

            // Вывод результатов
            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + difference);
            System.out.println("Деление: " + division);
            System.out.println("Умножение: " + multiplication);
        }
    }