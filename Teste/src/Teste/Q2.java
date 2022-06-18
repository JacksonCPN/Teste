package Teste;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		int i, A = 0, B = 1, C = 0;

		Scanner Q2 = new Scanner(System.in);

		System.out.println("Informe um numero:");
		i = Q2.nextInt();

		if (i > C) {
			C = A + B;
			A = B;
			B = C;

			System.out.println("O numero " + i + " pertence a sequencia");
		}
	}
}
