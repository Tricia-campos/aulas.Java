package HERANCA;

public class Professor extends Pessoa {
	double salario;

	public Professor(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}

	public void AplicarProva() {
		System.out.println("O professor está aplicando a prova");
	}
	public void Certificar() {
		System.out.println("O professor irá certificar");
	}
}
