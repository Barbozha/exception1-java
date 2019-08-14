package Programas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		metodo1();
	}
	
	public static void metodo2() {
		System.out.println("--- Start Metodo2 ---");
		Scanner ler = new Scanner(System.in);
		try {
			String[] vet = ler.nextLine().split(" ");
			int posicao = ler.nextInt();
			System.out.println(vet[posicao]);	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fora do posicionamento.");
			e.printStackTrace();
			ler.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Somente Números.");
		}
		System.out.println("Fim do Programa.");

		ler.close();
		System.out.println("--- End Metodo2 ---");
	}
	
	public static void metodo1 () {
		System.out.println("--- Start Metodo1 ---");
		metodo2();
		System.out.println("--- End Metodo1 ---");
	}

}
