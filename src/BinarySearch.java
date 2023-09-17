public class BinarySearch {
    private long iterations = 0; // Contador de iteraciones
    public Double[] runBinarySearch(int[] sortedArray, int key) {
        return runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);
    }

    private Double[] runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        long startTime = System.nanoTime(); // Usar nanoTime() en lugar de currentTimeMillis()
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            iterations++;
            int mid = low  + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }

        long endTime = System.nanoTime(); // Usar nanoTime() en lugar de currentTimeMillis()
        double elapsedTime = (endTime - startTime) / 1e9; // Convertir a segundos

        return new Double[] {elapsedTime, (double) iterations};
    }
}
