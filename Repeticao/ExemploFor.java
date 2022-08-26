package Repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		int contador, n;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escolha uma tabuada");
		n=ler.nextInt();
		
		System.out.println("Tabuada do 7\n");
		for(contador=1;contador<=10;contador++)
		{
			System.out.println(7+" x "+contador+" = "+7*contador);
		}
		
		System.out.println("\n\nTabuada do 7 invertida\n");
		for(contador=10;contador>=1;contador--)
			System.out.println(7+" x "+contador+" = "+7*contador);
		
		System.out.println("\n\nTadubadoa do "+n);
		for(contador=1;contador<=10;contador++)
			System.out.println(n+" x "+contador+" = "+n*contador);
			
		for(int x=2;x<=10;x++)
		{
			System.out.println("\nTabuada do "+x);
			for(contador=1;contador<=10;contador++)
				System.out.println(x+" x "+contador+" = "+x*contador);
		}
	}

}
