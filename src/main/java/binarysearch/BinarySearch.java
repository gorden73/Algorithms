package binarysearch;

import java.util.NoSuchElementException;

/**
 * Работает только с отсортированным списком элементов
 * Сложность алгоритма поиска O(log n)
 */
public class BinarySearch {

    public static int findElementInArrayByBinarySearchAndReturnIndex(int searchElement, int[] array) {
        int minBorder = 0;
        int maxBorder = array.length - 1;
        int middleElement;

        while (minBorder <= maxBorder) {
            middleElement = (maxBorder - minBorder) / 2 + minBorder;
            int guess = array[middleElement];

            if (guess == searchElement) {
                return middleElement;
            } else if (guess > searchElement) {
                maxBorder = middleElement - 1;
            } else {
                minBorder = middleElement + 1;
            }
        }
        throw new NoSuchElementException(String.format("Такой элемент %d не найден.", searchElement));
    }
}
