package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Olá");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro (A):");
		int A = sc.nextInt();
		System.out.println("Digite o segundo número inteiro (B):");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro número inteiro (C):");
		int C = sc.nextInt();
		System.out.println("Digite o quarto número inteiro (D):");
		int D = sc.nextInt();
		sc.close();

		int diferenca = (A * B) - (C * D); 
		System.out.printf("A diferença entre a multiplicação de A e B e de C e D é: %d%n", diferenca);
	}

}
