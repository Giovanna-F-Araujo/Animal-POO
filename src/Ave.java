
public class Ave extends Animal{

	//Contrutor de herança
	public Ave(String nome) {
		super(nome);
		
	}
	//Método da classe
	public void voar() {
		System.out.printf("%s está voando \n", getNome());
	}
}
