package patternstate;

public class Mario {
	
	protected MarioState estado;
	
	//Construtor da classe Mario
	public Mario() {
		estado = new MarioPequeno();
	}	
	
	//Metodos
	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();			
	}
	
	public void pegarFlor() {
		estado = estado.pegarFlor();
	}
	
	public void pegarPena() {
		estado = estado.pegarPena();
	}

	public void levarDano() {
		estado = estado.levarDano();
	}
}
