package main;

public class Metrics {
    public static long measureTime(Runnable algorithm) {
        long start = System.nanoTime();
        algorithm.run();
        return System.nanoTime() - start;
    }
}
