package Repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		double n1, n2;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		n1=ler.nextDouble();
		System.out.print("\nDigite o segundo numero: ");
		n2=ler.nextDouble();
		while(n2!=0)
		{
			System.out.println("O resultado da divisão é "+n1/n2);
			System.out.print("\nDigite o primeiro numero: ");
			n1=ler.nextDouble();
			System.out.print("\nDigite o segundo numero: ");
			n2=ler.nextDouble();
		}
		System.out.println("\nNão é possível divisão por ZERO!!!\nFIM DO PROGRAMA");
	}
	
	

}
