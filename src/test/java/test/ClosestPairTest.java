package test;

import main.ClosestPair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClosestPairTest {
    @Test
    void testClosest() {
        ClosestPair.Point[] points = {
                new ClosestPair.Point(0, 0),
                new ClosestPair.Point(3, 4),
                new ClosestPair.Point(1, 1)
        };
        double result = ClosestPair.findClosest(points);
        assertEquals(Math.sqrt(2), result, 1e-6);
    }
}
