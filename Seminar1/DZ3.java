
// В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

// В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

// Аргументы, передаваемые в метод/функцию:

// '3'
// '+'
// // '7'
// На выходе:
// 10.0
package Seminar1;

import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = scan.nextDouble();
        System.out.println("Введите операцию + - * /");
        char c = scan.next().charAt(0);
        System.out.println("Введите число b: ");
        double b = scan.nextDouble();
        scan.close();
        switch (c) {
            case '+':
            System.out.println(a + " + " + b + " = " + (a + b));
            break;
            case '-':
            System.out.println(a + " - " + b + " = " + (a - b));
            break;
            case '*':
            System.out.println(a + " * " + b + " = " + (a * b));
            break;
            case '/':
            System.out.println(a + " / " + b + " = " + (a / b));
            break;
            default:
            System.out.println("Некорректный оператор: " + c);        
        }
    }
}