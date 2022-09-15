package IntroPOO;

import java.util.Scanner;

public class Introducao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Caneta bic = new Caneta("verde", 0.4);
		Caneta faber = new Caneta("amarelo",0.6);
		Caneta kilom = new Caneta("dourado",1.0);
		
		//bic
		System.out.println("Dados da caneta bic");
		System.out.print("Digite a carga da caneta:");
		bic.carga=ler.nextInt();
		//bic.carga=73;
		bic.tampar();
		//bic.escrever();
		bic.estado();

		//faber
		System.out.println("\nDados da caneta faber");
		
		faber.carga=10;
		faber.estado();
		
		//kilom
		System.out.println("\nDados da caneta kilom");
		kilom.estado();
		ler.close();
	}
}
