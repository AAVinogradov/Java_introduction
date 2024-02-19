// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.

package Seminar1;

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        int num = (int) triangularNumber(number);
        System.out.println(num);
        scanner.close();
    }
    public static double triangularNumber(double x) {
        if (x < 1) {
            return -1;
        } else {
            return x * 0.5 * (x + 1);
        }
}

}