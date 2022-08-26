package Decisao;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		int idade;
		double altura;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		idade=ler.nextInt();
		System.out.print("Digite a altura: ");
		altura=ler.nextDouble();
		
		if(idade>=18 || altura>=1.6)
			System.out.println("Pode entrar!!");
		else
			System.out.println("Você não atende aos parametro");
	}

}
