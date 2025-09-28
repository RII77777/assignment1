package test;

import main.DeterministicSelect;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectTest {
    @Test
    void testSelect() {
        int[] arr = {7, 10, 4, 3, 20, 15};
        assertEquals(7, DeterministicSelect.select(arr, 2)); // 3rd smallest
    }
}
