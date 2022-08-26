package EntradaESaida;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int anos, meses,dias,resp;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite quantos anos você tem: ");
		anos=ler.nextInt();
		System.out.print("Digite quantos meses você tem: ");
		meses=ler.nextInt();
		System.out.print("Digite quantos dias você tem: ");
		dias=ler.nextInt();
		
		resp=anos*365+meses*30+dias;
		
		System.out.println("\nSua idade em dias é: "+ resp);

	}

}
