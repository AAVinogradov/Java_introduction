// Задача 1
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package Seminar1;

import java.time.LocalTime;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scan.nextLine();
        String hello = "";
        int h = LocalTime.now().getHour();
        if (h >= 5 && h < 12) {
            hello = "Доброе утро";
        } else if (h >= 12 && h < 18) {
            hello = "Добрый день";
        } else if (h >= 18 && h < 23) {
            hello = "Добрый вечер";
        } else {
            hello = "Доброй ночи";
        }
        System.out.printf(hello + ", " + name);
        scan.close();
    }
}
