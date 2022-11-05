package binarysearch;

import java.util.Arrays;
import java.util.Random;

/**
 * Работает только с отсортированным списком элементов
 * Сложность алгоритма поиска O(log_2n)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int randomInteger = findRandomInteger();
        findElementInArrayByBinarySearch(randomInteger, 10000);
    }

    public static int findRandomInteger() {
        Random random = new Random();
        return random.nextInt(10001);
    }

    public static void findElementInArrayByBinarySearch(int searchElement, int arraySize) {
        int[] array = createAndFillArray(arraySize);
        int count = 0;
        int minBorder = 0;
        int maxBorder = array.length - 1;
        int middleElement;

        while (minBorder <= maxBorder) {
            count++;
            middleElement = (maxBorder - minBorder) / 2 + minBorder;
            int guess = array[middleElement];

            if (guess == searchElement) {
                System.out.println(Arrays.toString(array));
                System.out.println("Индекс искомого элемента " + middleElement);
                System.out.println("Количество итераций до завершения поиска " + count);
                break;
            } else if (guess > searchElement) {
                maxBorder = middleElement - 1;
            } else {
                minBorder = middleElement + 1;
            }
        }

        if (minBorder >= maxBorder) {
            System.out.println("Элемента " + searchElement + " нет.");
        }
    }

    private static int[] createAndFillArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
