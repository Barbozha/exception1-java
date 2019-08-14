package Programas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PercorrendoArquivos {

	public static void main(String[] args) {
		File file = new File("C:\\Barboza\\Cursos\\JAVA\\intrada.txt");
		Scanner ler = null;
		try {
			ler = new Scanner(file);
			while(ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Error Open File: "+ e.getMessage());
		}
		finally{
			if (ler != null) {
				ler.close();
			}
			System.out.println("O bloco finally foi executado.");
		}
	}

}
