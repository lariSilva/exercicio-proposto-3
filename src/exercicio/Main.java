package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ol�");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro (A):");
		int A = sc.nextInt();
		System.out.println("Digite o segundo n�mero inteiro (B):");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro (C):");
		int C = sc.nextInt();
		System.out.println("Digite o quarto n�mero inteiro (D):");
		int D = sc.nextInt();
		sc.close();

		int diferenca = (A * B) - (C * D); 
		System.out.printf("A diferen�a entre a multiplica��o de A e B e de C e D �: %d%n", diferenca);
	}

}
