
public class Cachorro extends Animal{
	
	//Construtor de herança
	public Cachorro (String nome) {
		super(nome);
	}
	//Métodos da classe
	public void latir() {
		System.out.printf("%s latiu \n", getNome());
	}
	public void lamber() {
		System.out.printf("%s lambeu \n", getNome());
	}
}
