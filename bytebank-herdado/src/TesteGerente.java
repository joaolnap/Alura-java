
public class TesteGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("João");
		gerente.setCpf("06432165478");
		gerente.setSalario(4000);
		
		gerente.setSenha(2020);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		boolean autentica = gerente.autentica(2020);
		
		System.out.println(autentica);

	}

}
