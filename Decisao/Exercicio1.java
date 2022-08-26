package Decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Digite 3 numeros");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		if(n1>n2 && n1>n3)
			System.out.println("O maior número é "+ n1);
		else if(n1<n2 && n2>n3)
			System.out.println("O maior número é "+ n2);
		else
			System.out.println("O maior número é "+ n3);
	}

}
