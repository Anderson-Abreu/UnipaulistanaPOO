package Repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,cont=0,soma=0;
		do
		{
			System.out.print("Digite um numero: ");
			n=ler.nextInt();
			if(n%3==0 && n!=0)
			{	
				soma+=n;
				cont++;
			}
		}while(n!=0);
		System.out.println("A média dos numeros multiplos de 3 é: "+(soma/cont));

	}

}
