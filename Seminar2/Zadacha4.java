// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
package Seminar2;

import java.io.FileWriter;

public class Zadacha4 {
    public static void main(String[] args) {
        String resWord = repeatWord("TEST", 100);
    writeToFile(resWord, "New.txt");
    }
    public static String repeatWord(String word, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word).append(" ");
        }
    return sb.toString();
    }
    public static void writeToFile(String str, String fileName){
        try (FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write(str);

        }
        catch (Exception e){
            e.printStackTrace();
        }
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(fileName);
//            fileWriter.write(str);
//        }
//    catch (Exception e){
//            e.printStackTrace();
//        }
//        finally {
//          try{
//              fileWriter.close();
//            }
//          catch (Exception e){
//              e.printStackTrace();
//          }
//        }

    }
}
