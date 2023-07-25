import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int amount;

        System.out.print("Ingrese el valor de números a ingresar N: ");
        try {
            amount = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException exception) {
            throw new RuntimeException("Debes ingresar un número entero x_x. ERROR!!!!");
        }

        int[] randomNumbers = new int[amount];
        for (int i = 0; i < amount; i++) {
            randomNumbers[i] = random.nextInt(1, 10000000);
            System.out.print(randomNumbers[i] + " ");
        }

        quickSort.sort(randomNumbers);
        bubbleSort.burbuja(randomNumbers);
    }
}