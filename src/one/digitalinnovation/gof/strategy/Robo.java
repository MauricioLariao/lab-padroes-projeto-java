package one.digitalinnovation.gof.strategy;

public class Robo {

	//aqui esta a estrategia
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
