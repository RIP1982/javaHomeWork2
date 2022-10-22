/* Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в
консоль результат вида:
        1 Расширение файла: txt

        2 Расширение файла: pdf

        3 Расширение файла:

        4 Расширение файла: jpg */

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        File file1 = new File("/text.txt");
        File file2 = new File("/Document.pdf");
        File file3 = new File("/Picture.jpg");
        File file4 = new File("/none");
        getExtension(file1);
        getExtension(file2);
        getExtension(file3);
        getExtension(file4);
    }
    static void getExtension(File file) {
        {
            String str = file.toString();
            int symbol = str.indexOf('.');
            String ext = "";
            if (symbol > 0) {
                for (int i = symbol + 1; i < str.length(); i++) {
                    ext += str.charAt(i);
                }
                System.out.println("File etxtension: " + ext);
            }
            else {
                System.out.println("File etxtension: ");
            }
        }
    }
}