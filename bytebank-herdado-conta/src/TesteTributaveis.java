
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(4448,442048);
		conta.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.registra(conta);
		calculador.registra(seguro);
		
		System.out.println(calculador.getTotalImposto());

	}

}
