package q3;

public class Teste {

	public static void main(String[] args) {

		Semaforo c3 = new Semaforo(Cores.VERDE,"Pode andar");
		Semaforo c2 = new Semaforo(Cores.AMARELO,"Aguarde");
		Semaforo c1 = new Semaforo(Cores.VERMELHO,"Parado");
	
		
		Farol f1 = new Farol("Carro 1", c1);
		f1.infF();
		f1.mudarF(c2);
		f1.infF();
		f1.mudarF(c3);
		f1.infF();
			
		
		
	}

}
