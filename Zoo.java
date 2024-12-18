package CAPSULAMENTO;

public class Zoo {

	public static void main(String[] args) {
		Animal A1 = new Animal();
		
		A1.setNome("Zara");
		A1.setTutor("Trícia");
		A1.setRG("2548515");
		A1.setRaca("Cachorro");
		A1.setAniversario("Fevereiro");
		A1.setIdade(2); 
		
		System.out.printf("Nome do animal: " + A1.getNome());
		
		System.out.printf(" Nome do Tutor: " + A1.getTutor());
	}

}
