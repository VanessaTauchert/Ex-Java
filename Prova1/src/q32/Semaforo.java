package q32;

public class Semaforo {
	private Cores corProxima;

	public void estado(Cores corAtual) {
		if (corAtual.equals(Cores.VERDE)) {
			corProxima = Cores.AMARELO;
			System.out.println("Verde: Em frente");
		} 
		if (corAtual.equals(Cores.AMARELO)) {
			corProxima = Cores.VERMELHO;
			System.out.println("Amarelo: Atenção");
		}
		if (corAtual.equals(Cores.VERMELHO)) {
			corProxima = Cores.VERDE;
			System.out.println("Vermelho: Pare!");
		}
		
		System.out.println("Próxima cor: " + corProxima);
	}
}
