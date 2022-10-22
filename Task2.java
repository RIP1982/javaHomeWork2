/* Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл. */

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class Task2 {
    public static void main(String[] args) {
        int[] newArray = fillArray();
        System.out.println(Arrays.toString(newArray));
        for (int i = 1; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if(newArray[i] < newArray[i - 1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i - 1];
                    newArray[i - 1] = temp;
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