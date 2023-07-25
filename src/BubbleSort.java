public class BubbleSort {
    public static void burbuja(int[] nums) {
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
    }

    public static void main(String[] args) {
        int[] nums = new int[20000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 15 + 3);
        }
        System.out.println("desordenado: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("ordenado: ");

        long startTime = System.currentTimeMillis();
        burbuja(nums);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Tiempo de ejecución: " + (elapsedTime / 1000.0) + " segundos");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
