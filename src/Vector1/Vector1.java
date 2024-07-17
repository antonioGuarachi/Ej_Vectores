package Vector1;
import java.util.Scanner;
/*
 * Autor: Marcos Guarachi Mamani
 * Ej. Vectores 1
 */
public class Vector1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el tamaño del vector: ");
		int N = scanner.nextInt();

		int[] vector = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Ingrese un número entero: ");
			vector[i] = scanner.nextInt();
		}

		int mayor = vector[0];

		for (int i = 1; i < N; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}

		System.out.println("El número mayor en el vector es: " + mayor);
	}
}
