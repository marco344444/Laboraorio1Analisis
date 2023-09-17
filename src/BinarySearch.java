public class BinarySearch {
    private long iterations = 0; // Contador de iteraciones
    public Double[] runBinarySearch(int[] sortedArray, int key) {
        return runBinarySearchIteratively(sortedArray, key, 0, sortedArray.length - 1);
    }

    private Double[] runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        long startTime = System.currentTimeMillis();
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

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        //if (index == Integer.MAX_VALUE) return -1;
        //return index;

        return new Double[] {elapsedTime/1000.0, (double) iterations};
    }
}