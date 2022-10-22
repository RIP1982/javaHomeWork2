/* Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл. */

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {
        int[] newArray = fillArray();
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            for (int j = newArray.length - 1; j > i; j--) {
                if(newArray[j] < newArray[j - 1]) {
                    int temp = newArray[j];
                    newArray[j] = newArray[j - 1];
                    newArray[j - 1] = temp;
                    Logger logger = Logger.getAnonymousLogger();
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