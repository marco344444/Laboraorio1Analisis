import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        BinarySearch binarySearch = new BinarySearch();
        //QuickSort quickSort = new QuickSort();
        //BubbleSort bubbleSort = new BubbleSort();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa el nombre del archivo .csv");
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine() + ".csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Cantidad,Tiempo 1,Tiempo 2,Tiempo 3,Tiempo 4,Tiempo 5,Promedio Tiempo,Iteración 1,Iteración 2,Iteración 3,Iteración 4,Iteración 5,Promedio Iteración");
        bufferedWriter.newLine();
        int start, end, interval, amount;
        boolean option;

        System.out.print("Donde inicia: ");
        start = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Donde termina: ");
        end = Integer.parseInt(bufferedReader.readLine());
        System.out.print("El intervalo: ");
        interval = Integer.parseInt(bufferedReader.readLine());
        //System.out.print("¿Quieres probar con bubblesort?: ");
        //option = Boolean.parseBoolean(bufferedReader.readLine());

        amount = start;
        int[] randomNumbers;
        int randomKey;
        Double[] holder;
        double timeAverage;
        double iterationsAverage;
        LinkedList<Double> time = new LinkedList<>();
        LinkedList<Double> iterations = new LinkedList<>();

        while (amount <= end) {
            timeAverage = 0;
            iterationsAverage = 0;
            for (int i = 0; i < 5; i++) {
                randomNumbers = new int[amount];
                for (int j = 0; j < amount; j++) {
                    randomNumbers[j] = random.nextInt(1, 10000);
                }

                Arrays.sort(randomNumbers);
                randomKey = random.nextInt(1, 10000);

                //if (option) holder = bubbleSort.sort(randomNumbers.clone());
                //else holder = quickSort.sort(randomNumbers.clone());
                holder = binarySearch.runBinarySearch(randomNumbers, randomKey);

                time.add(holder[0]);
                timeAverage += holder[0];
                iterations.add(holder[1]);
                iterationsAverage += holder[1];

                System.out.println("Cantidad de números: " + amount);
            }

            bufferedWriter.write(amount + ",");

            // se escriben los tiempos hasta el 5
            for (double num : time) {
                bufferedWriter.write(num + ",");
            }

            // tiempo promedio
            bufferedWriter.write(timeAverage/5 + ",");

            // iteraciones hasta la 5
            for (double num : iterations) {
                bufferedWriter.write((long) num + ",");
            }

            // iteracion promedio
            bufferedWriter.write((long) iterationsAverage/5 + ",");
            bufferedWriter.newLine();

            time.clear();
            iterations.clear();

            amount += interval;
        }

        bufferedWriter.close();
        System.out.println("Se debería haber escrito el archivo CSV exitosamente.");

        /*
        int arrSize;

        System.out.println("Ingresa el tamaño del array");
        arrSize = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arrSize; i++) {
            arrayList.add(random.nextInt(10, 21));
        }

        Collections.sort(arrayList);
        System.out.println(binarySearch.runBinarySearch(arrayList.toArray(new Integer[0]), 20));

         */

    }
}