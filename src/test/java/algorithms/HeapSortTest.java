package algorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeapSortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {42};
        new HeapSort().sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        new HeapSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        new HeapSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {4, 1, 3, 4, 2, 1};
        new HeapSort().sort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, arr);
    }
}
