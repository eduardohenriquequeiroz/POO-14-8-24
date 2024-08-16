package poo;
import java.util.ArrayList;
import java.util.Scanner;

public class VerificarNumerosPositivosNegativos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList<>();

		System.out.println("Digite números inteiros (digite '0' para finalizar):");

		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros.add(numero);
		}

		if (todosPositivos(numeros)) {
			System.out.println("Todos os números são positivos.");
		} else {
			System.out.println("Nem todos os números são positivos.");
		}
	} 

	public static boolean todosPositivos(ArrayList <Integer> numeros) {
		for (int numero : numeros) {
			if (numero <= 0) { // Verifica se o número é positivo ou zero
				return false;
			}
		}
		return true;
	}
}