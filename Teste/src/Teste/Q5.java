package Teste;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner TXT = new Scanner(System.in);

		System.out.println("Inserir texto:");
		String texto = TXT.nextLine();
		
		System.out.println(new StringBuilder(texto).reverse().toString());
		
	}
}