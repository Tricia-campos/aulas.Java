package Javapoo;

public class Honda extends Carro {
	public String motor;
	
	public Honda() {
	}
	public Honda(String m) {
		this.modelo=m;
	}
	public Honda(String m,String c) {
		this.modelo=m;
		this.cor=c;
	}
	public Honda(String m,String c,double p) {
		this.modelo=m;
		this.cor=c;
		this.preco=p;
	}
}
