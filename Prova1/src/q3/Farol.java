package q3;

public class Farol {
	private String carro;
	private Semaforo semaforo;

	public Farol(String carro, Semaforo semaforo) {
	this.carro = carro;
	this.semaforo = semaforo;
}
 
	public void mudarF(Semaforo semaforo) {
		System.out.println("Farol mudando de cor");
		this.semaforo = semaforo;
	}

	public void infF() {
		semaforo.mostrarF();
	}
	
 
}
