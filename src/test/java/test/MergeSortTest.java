package test;

import main.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeTest {
    @Test
    void testSort() {
        int[] arr = {5, 2, 9, 1, 3};
        Merge.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 9}, arr);
    }
}
