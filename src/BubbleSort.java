public class BubbleSort {
    private int iterations = 0; // Contador de iteraciones

    public void sort(int[] nums) {
        long startTime = System.currentTimeMillis();

        int i, j, aux;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 0; j < nums.length - i - 1; j++) {
                iterations++; // Incrementar el contador en cada iteración
                if (nums[j + 1] < nums[j]) {
                    aux = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = aux;
                }
            }
        }

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("\nTiempo de ejecución bubbleSort: " + (elapsedTime / 1000.0) + " segundos");
        System.out.println("Número de iteraciones: " + iterations);
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
