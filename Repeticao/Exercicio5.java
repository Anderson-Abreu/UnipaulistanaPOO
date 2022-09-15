package Repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma=0, n;
		do
		{
			System.out.println("Digite um n�mero: ");
			n=ler.nextInt();
			soma+=n;//soma=soma+n
		}while(n!=0);
		System.out.println("A soma total �: "+soma);
	}

}
