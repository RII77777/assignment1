package test;

import main.Quick;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickTest {
    @Test
    void testSort() {
        int[] arr = {10, -2, 5, 0, 8};
        Quick.sort(arr);
        assertArrayEquals(new int[]{-2, 0, 5, 8, 10}, arr);
    }
}
