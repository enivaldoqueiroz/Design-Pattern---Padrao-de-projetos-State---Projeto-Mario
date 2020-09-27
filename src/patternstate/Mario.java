package patternstate;

public class Mario {
	
	protected MarioState estado;
	
	//Construtor da classe Mario
	public Mario() {
		estado = new MarioPequeno();
	}	
	
}
