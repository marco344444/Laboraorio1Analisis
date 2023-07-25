public class QuickSort {
    public void sort(int[] array) {
        long startTime = System.currentTimeMillis();

        quickSort(array, 0, array.length-1);

        long endTime = System.currentTimeMillis();

        //for (int num : array)
        //    System.out.print(num + " ");

        long elapsedTime = endTime - startTime;
        System.out.println("\nTiempo de ejecución quicksort: " + (elapsedTime / 1000.0) + " segundos");
    }

    private void quickSort(int[] arr, int min, int max) {
        if (min < max) {
            int pi = partition(arr, min, max);

            quickSort(arr, min, pi - 1);
            quickSort(arr, pi + 1, max);
        }
    }

    private int partition(int[] arr, int min, int max) {
        int pivot = arr[max];
        int i = (min - 1);

        for (int j = min; j <= max - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, max);
        return (i + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int holder = arr[i];
        arr[i] = arr[j];
        arr[j] = holder;
    }

    public static void printArr(int[] arr)
    {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
