package IntroPOO;

public class Caneta {
	//ATRIBUTOS
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	//MÉTODO CONSTRUTOR
	
	public Caneta(String x, double y)
	{
		this.tampada=true;
		this.carga=100;
		this.cor=x;
		this.ponta=y;
	}
	
	//MÉTODOS
	public void escrever()
	{
		if(this.tampada==true)
			System.out.println("Erro!!Caneta esta tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}

	public void estado()
	{
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Esta tampada? "+this.tampada);
		System.out.println("A carga atual é "+this.carga+"%");
	}
}
