package patternstate;

public class Principal {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		
		mario.pegarCogumelo(); 	//Mario grande
		mario.pegarCogumelo(); 	//Ganhou 1000 pontos
		mario.pegarFlor();		//Mario grande com fogo
		mario.levarDano();		//Mario grande
		mario.levarDano();		//Mario pequeno
		mario.levarDano();

	}

}
