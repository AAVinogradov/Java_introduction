// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
package Seminar1;

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 1000 ");
        int maxCount = scanner.nextInt();
        scanner.close();
        if ((maxCount > 1000) | (maxCount < 1)) {
            System.out.println("Не верное задано значение!");
        } else {
            printPrimeNums(maxCount);
        }
    }
    public static void printPrimeNums(int maxCount) {
        int count = 0;
        for (int i = 2; i <= maxCount; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) { 
                    count++;
                }
                    if (count == i - 2) {
                        System.out.println(i);
                    }
            }
            count = 0;
            }    
        }
        
}
