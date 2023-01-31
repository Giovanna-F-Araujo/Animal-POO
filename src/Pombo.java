
public class Pombo extends Ave {
	//Atributo
	private int cartasEnviadas;
	
	/*Construtor da subclasse Ave que está herdando da super classe animal */

	public Pombo(String nome) {
		super(nome);
		this.cartasEnviadas = 10;

	}
	//Métodos da classe
	public void enviarCarta() {
		System.out.printf("O %s enviou a(s) carta(s) \n", getNome());
		cartasEnviadas++;
	}
	public int getCartasEnviadas() {
		return cartasEnviadas;
	}
	
}
