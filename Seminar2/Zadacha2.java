// Задание №2 📌Напишите метод, который сжимает строку. 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.
package Seminar2;

public class Zadacha2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(pack(s));
    }

    public static String pack(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count++;
            else {
                sb.append(c).append(count);
                count = 1;
                c = s.charAt(i);
            }
        }
        sb.append(c).append(count);
        return sb.toString();
    }
}
