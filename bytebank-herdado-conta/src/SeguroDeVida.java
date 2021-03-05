
public class SeguroDeVida implements Tributavel {

	private double valor = 42;
	@Override
	public double getTributacao() {
		
		return this.valor;
	}

}
