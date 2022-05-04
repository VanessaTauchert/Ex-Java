package q5;


public class Jogo {
	Moeda moeda;
	static int jogar;
	private int coroa;


	public void jogadas() {
		
		
		if(jogar % 2 ==0) {
			jogar++;
			moeda = Moeda.CARA;
			System.out.println("Cara");
		}else {
			jogar++;
			moeda = Moeda.COROA;
			System.out.println("Coroa");
		}
	}
	
	void coroa() {
		moeda = Moeda.COROA;
		System.out.println(coroa);
	}
	
		
	
	}
		
