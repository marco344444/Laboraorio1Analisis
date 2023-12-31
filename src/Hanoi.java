import java.util.*;

public class Hanoi {
    // Contador para llevar un registro de los movimientos
    private static int movimientos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();

        long startTime = System.currentTimeMillis(); // Registro del tiempo de inicio
        Hanoi(n, 1, 2, 3);
        long endTime = System.currentTimeMillis();   // Registro del tiempo de finalización

        System.out.println("Número total de movimientos: " + movimientos);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos");
    }

    // Método Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.println("Mover disco de " + origen + " a " + destino);
            movimientos++;
        } else {
            Hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("Mover disco de " + origen + " a " + destino);
            movimientos++;
            Hanoi(n - 1, auxiliar, origen, destino);
        }
    }
}
