
public class Dragao extends Ave{
	/*Construtor da subclasse Ave que está herdando da super classe animal */
	
	public Dragao(String nome) {
		super(nome);
		
	}
	//Método da classe 
	public void soltarFogo() {
		System.out.printf("%s soltou uma bola de fogo \n", getNome());
	}
	
}
