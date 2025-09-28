package main;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestPair {
    public static class Point {
        double x, y;
        public Point(double x, double y) { this.x = x; this.y = y; }
    }

    public static double findClosest(Point[] points) {
        Arrays.sort(points, Comparator.comparingDouble(p -> p.x));
        return closest(points, 0, points.length - 1);
    }

    private static double closest(Point[] points, int left, int right) {
        if (right - left <= 3) return bruteForce(points, left, right);
        int mid = (left + right) / 2;
        double d1 = closest(points, left, mid);
        double d2 = closest(points, mid + 1, right);
        double d = Math.min(d1, d2);

        double midX = points[mid].x;
        Point[] strip = Arrays.stream(points, left, right + 1)
                .filter(p -> Math.abs(p.x - midX) < d)
                .toArray(Point[]::new);
        Arrays.sort(strip, Comparator.comparingDouble(p -> p.y));

        for (int i = 0; i < strip.length; i++) {
            for (int j = i + 1; j < strip.length && (strip[j].y - strip[i].y) < d; j++) {
                d = Math.min(d, dist(strip[i], strip[j]));
            }
        }
        return d;
    }

    private static double bruteForce(Point[] points, int left, int right) {
        double min = Double.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right; j++) {
                min = Math.min(min, dist(points[i], points[j]));
            }
        }
        return min;
    }

    private static double dist(Point a, Point b) {
        return Math.hypot(a.x - b.x, a.y - b.y);
    }
}
