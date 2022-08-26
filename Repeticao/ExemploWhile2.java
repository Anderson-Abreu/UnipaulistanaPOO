package Repeticao;

import java.util.Scanner;

public class ExemploWhile2 {

	public static void main(String[] args) {
		int n;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escolha uma tabuada do 1 ao 10: ");
		n=ler.nextInt();
		
		while(n>0 && n<=10)
		{
			System.out.println("\nTabuada do "+n);
			for(int x=1;x<=10;x++)
				System.out.println(n+" X "+x+" = "+n*x);
			System.out.print("\nEscolha uma tabuada do 1 ou 10: ");
			n=ler.nextInt();
		}
		System.out.println("Opção inválida!!!\nFim do programa");

	}

}
