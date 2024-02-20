// Задание №1 📌 Дано четное число N (>0) и символы c1 и c2. 📌 Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminar2;

public class Zadacha1 {
    public static void main(String[] args) {
        int n = 500_000;
        char c1 = 'G';
        char c2 = 'b';

        // GbGbGbGb

        long start = System.currentTimeMillis();
        getAlternatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getAlternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);


    }

    public static String getAlternatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }

        return str;
    }

    public static String getAlternatingCharsSb(int n, char c1, char c2) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }

        return sb.toString();
    }
}