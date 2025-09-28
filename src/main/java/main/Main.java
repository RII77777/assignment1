package main;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {5, 2, 9, 1, 5, 6};
        MergeSort.sort(arr1);
        System.out.print("MergeSort result: ");
        for (int x : arr1) System.out.print(x + " ");
        System.out.println();


        int[] arr2 = {3, 7, 8, 5, 2, 1, 9};
        QuickSort.sort(arr2);
        System.out.print("QuickSort result: ");
        for (int x : arr2) System.out.print(x + " ");
        System.out.println();


        int[] arr3 = {3, 7, 8, 5, 2, 1, 9};
        int k = 3;
        int kth = DeterministicSelect.select(arr3, k - 1);
        System.out.println(k + "rd smallest element = " + kth);

        ClosestPair.Point[] points = {
                new ClosestPair.Point(0, 0),
                new ClosestPair.Point(1, 1),
                new ClosestPair.Point(2, 3),
                new ClosestPair.Point(5, 4)
        };
        double dist = ClosestPair.findClosest(points);
        System.out.println("Closest pair distance = " + dist);
    }
}
