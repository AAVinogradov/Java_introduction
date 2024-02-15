package Seminar1;
// Задача 4
// Текст задачи:
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
public class Zadacha4 {
    public static void main(String[] args) {
        task("Добро пожаловать на курс по Java");
    }
    static void task(String str){// "Добро пожаловать на курс по Java"
        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        for (int i = strArr.length - 1; i >= 0 ; i--) {
            System.out.print(strArr[i] + " ");
        }
    }
}
