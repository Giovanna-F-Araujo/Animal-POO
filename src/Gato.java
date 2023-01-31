
public class Gato extends Animal{
	
	//Construtor da herança
	public Gato (String nome) {
		super(nome);
	}
	
	//Metodo da classe
	public void miar() {
		System.out.printf("%s miou \n", getNome());
	}
}
