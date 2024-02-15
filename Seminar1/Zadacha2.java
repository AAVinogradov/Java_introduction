// Задача 2
// /Текст задачи:
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
package Seminar1;

public class Zadacha2 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count++;
            else count = 0;
            if (count > maxOnes) {
                maxOnes = count;
            }
        }
        System.out.println(maxOnes);
    }
}
