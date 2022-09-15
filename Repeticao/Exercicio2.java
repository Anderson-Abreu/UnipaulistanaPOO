package Repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,cp=0,ci=0;
		for (int x=1;x<=10;x++)
		{	
			System.out.print("Digite um número: ");
			n1=ler.nextInt();
			if(n1%2==0)
				cp++;
			else
				ci++;
		}
		System.out.println("O total de n�meros pares : "+ cp);
		System.out.println("O total de n�meros impares: "+ci);
	}

}
