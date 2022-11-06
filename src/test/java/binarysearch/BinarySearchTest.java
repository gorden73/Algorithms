package binarysearch;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearchTest {

    @Test
    void shouldFindElementInArrayByBinarySearch() {
        int[] array = {4, 12, 14, 16, 33, 51, 200};
        int indexOfSearchElement = BinarySearch.findElementInArrayByBinarySearchAndReturnIndex(16, array);
        assertEquals(3, indexOfSearchElement);
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenElementIsNotFound() {
        int[] array = {4, 12, 14, 16, 33, 51, 200};
        NoSuchElementException exception = assertThrows(NoSuchElementException.class,
                () -> BinarySearch.findElementInArrayByBinarySearchAndReturnIndex(400, array));
        assertEquals("Такой элемент 400 не найден.", exception.getMessage());
    }
}