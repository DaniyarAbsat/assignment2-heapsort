package cli;
import algorithms.HeapSort;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        HeapSort sorter = new HeapSort();
        int[] sizes = {100, 1000, 10000, 100000};

        for (int n : sizes) {
            int [] arr = generateRandomArray(n);
            System.out.println("Array size: " + n);
            sorter.sort(arr);
        }
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }
}
