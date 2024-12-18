package HERANCA;

public class Funcionario extends Pessoa {

	public Funcionario(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	
	public void Receber() {
		System.out.println("Acabou de receber!");
	}
	public void Dever () {
		System.out.println("Ja ta devendo!");
	}
}

