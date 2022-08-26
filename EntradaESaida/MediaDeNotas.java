package EntradaESaida;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		double n1,n2,n3,n4,media;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a Primeira nota: ");
		n1=ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2=ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3=ler.nextDouble();
		System.out.print("Digite a quarta nota: ");
		n4=ler.nextDouble();
		
		media=(n1+n2+n3+n4)/4;
		
		System.out.println("\nA media é: "+media);
		ler.close();
	}

}
