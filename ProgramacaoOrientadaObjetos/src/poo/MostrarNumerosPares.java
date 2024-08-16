package poo;
import java.util.ArrayList;
import java.util.Scanner;

public class MostrarNumerosPares {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in); 
		ArrayList <Integer> numeros = new ArrayList<>(); 

		System.out.println("Digite números inteiros (digite '0' para finalizar):"); 

		while (true) {
			int numero = scanner.nextInt(); 
			if (numero == 0) { 
				break; 
			}
			numeros.add(numero); 
		}

		System.out.println("Números pares na lista:"); 
		mostrarNumerosPares (numeros); 
	}

	public static void mostrarNumerosPares(ArrayList <Integer> numeros) {
		for (int numero : numeros) { 
			if (numero % 2 == 0) { 
				System.out.println(numero); 
			}
		}
	}
}
