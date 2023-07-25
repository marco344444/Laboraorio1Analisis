public class BubbleSort {
    public void burbuja(int[] nums) {
        long startTime = System.currentTimeMillis();

        int i, j, aux;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    aux = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = aux;
                }
            }
        }

        long endTime = System.currentTimeMillis();

        //for (int num : nums)
        //    System.out.print(num + " ");

        long elapsedTime = endTime - startTime;
        System.out.println("\nTiempo de ejecución bubbleSort: " + (elapsedTime / 1000.0) + " segundos");
    }
}
