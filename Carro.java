package Javapoo;

public class Carro {
	String modelo,cor;
	double preco;
	boolean ligado = true, desligado = true, acelerar =true, frear=true;
	
	public void ligar() {
		if(desligado = true)
			System.out.println("O carro está ligando..");
		else
			System.out.println("O carro está ligado!");
	}	
	public void Desligar() {
		if(ligado = true)
			System.out.println("O carro está desligando..");
		else
			System.out.println("O carro está desligado!");
	}
	public void Acelerar() {
		if(ligado = true)
			System.out.println("O carro está acelerando..");
		else
			System.out.println("O carro não pode acelerar porque está desligado!");
	}
	public void frear() {
		if(acelerar = true)
			System.out.println("O carro está freando..");
		else
			System.out.println("O carro está parado!");
			}
	
	
	public void carac() {
		System.out.printf("O carro é um %S, da cor %S, e o valor é %S",this.modelo, this.cor, this.preco);
		}
	public Carro() {
	
	}
	public Carro(String m) {
		this.modelo=m;
	}
	public Carro(String m,String c) {
		this.modelo=m;
		this.cor=c;
	}
	public Carro(String m,String c,double p) {
		this.modelo=m;
		this.cor=c;
		this.preco=p;
	}
	
}
	


