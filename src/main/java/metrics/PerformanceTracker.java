package metrics;

public class PerformanceTracker {
    private long comparisons;
    private long swaps;
    private long arrayAccesses;
    private long startTime;
    private long endTime;

    public void start(){
        startTime = System.nanoTime();
    }

    public void end() {
        endTime = System.nanoTime();
    }

    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementSwaps() {
        swaps++;
    }

    public void incrementAccesses(int count) {
        arrayAccesses += count;
    }

    public void printResults() {
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Array accesses: " + arrayAccesses);
        System.out.printf("Execution time: %.3f ms%n", (endTime - startTime) / 1e6);
    }
}
