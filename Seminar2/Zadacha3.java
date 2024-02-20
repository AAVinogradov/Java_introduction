// Задание №3 📌Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
package Seminar2;

public class Zadacha3 {
      public static void main(String[] args) {
        String s = "fyysf";
        System.out.println(isPolyndrome(s));
        
      }
      static boolean isPolyndrome(String s){
        for (int i = 0, k = s.length()-1; i < k; i++, k--) {
            if (s.charAt(i) != s.charAt(k))
                return false;
        }
        return true;
    }
}
