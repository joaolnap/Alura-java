
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		SistemaInterno autentica = new SistemaInterno();
		autentica.autentica(gerente);

	}

}
