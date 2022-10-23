/* Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл. */

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] newArray = fillArray();
        System.out.println(Arrays.toString(newArray));
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fileHandler = new FileHandler("src/log.xml");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = newArray.length - 1; j > i; j--) {
                if(newArray[j] < newArray[j - 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j - 1];
                    newArray[j - 1] = temp;
                    logger.addHandler(fileHandler);
                    SimpleFormatter simpleFormatter = new SimpleFormatter();
                    fileHandler.setFormatter(simpleFormatter);
                    logger.info(Arrays.toString(newArray));
                }
            }
        }
    }

    static int[] fillArray() {
        Random random = new Random();
        int length = random.nextInt(5,10);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }
}