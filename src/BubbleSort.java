public class BubbleSort {
    private long iterations = 0; // Contador de iteraciones

    public Double[] sort(int[] nums) {
        long startTime = System.currentTimeMillis();

        int i, j, aux;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    iterations++; // Incrementar el contador en cada iteración
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

        return new Double[] {elapsedTime/1000.0, (double) iterations};
    }

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
