
public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Caramelo");
		cachorro.comer();
		cachorro.latir();
		
		Gato gato = new Gato("Salem");
		gato.miar();
		gato.beber();
		
		Dragao dragao = new Dragao("Harry");
		dragao.voar();
		dragao.soltarFogo();
		
		Pombo pombo = new Pombo("Robson");
		pombo.comer();
		pombo.voar();
		pombo.enviarCarta();
	}

}
