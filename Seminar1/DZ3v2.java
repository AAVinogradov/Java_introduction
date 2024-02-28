package Seminar1;

import java.util.Scanner;

public class DZ3v2 {
    public static void main(String[] args) {
        double res = calculate();
        System.out.println(res);
    }
    public static double calculate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = scan.nextDouble();
        System.out.println("Введите операцию + - * /");
        char c = scan.next().charAt(0);
        System.out.println("Введите число b: ");
        double b = scan.nextDouble();
        scan.close();
        double result = 0;
        switch (c) {
            case '+':
            result = a + b;
            break;
            case '-':
            result = a - b;
            break;
            case '*':
            result = a * b;
            break;
            case '/':
            result = a / b;
            break;
            default:
            System.out.println("Некорректный оператор: " + c); 
        }
        return result;
    }
}