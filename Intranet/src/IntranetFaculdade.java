
public class IntranetFaculdade {
	private int senha = 222;

	public void autenticacao(AcessoRestrito acesso) {

		boolean autenticou = acesso.autorizacao(this.senha);

		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println(" nao Pode entrar no sistema");
		}
	}

}
