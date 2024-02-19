// Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.
package Seminar1;

import java.util.Scanner;

public class DZ1v2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        System.out.println(triangularNumber(number));
        scanner.close();
    }
    public static int triangularNumber(double x) {
        if (x < 1) {
            return -1;
        } else {
            double count = x * 0.5 * (x + 1);
            int num = (int) count;
            return num;
            
        }
}

}