package q3;

public class Semaforo {
	private String cor;
	
	private Cores cores;
	
	public Semaforo(Cores cores, String cor) {
		this.cores = cores;
		this.cor = cor;
	}

		
	public void mostrarF() {
		System.out.println("Farol " + cores);
		System.out.println(cor);
		
	}
	
}
