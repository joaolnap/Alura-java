
public class Professor implements AcessoRestrito {

	private MetodoDeAcesso acessar;
	public Professor() {
		this.acessar = new MetodoDeAcesso();
	}
	@Override
	public boolean autorizacao(int senha) {
		return this.acessar.autorizacao(senha);
	}

	@Override
	public int getSenha() {
		return this.acessar.getSenha();
	}

	@Override
	public void setSenha(int senha) {
		this.acessar.setSenha(senha);
		
	}


	
	
}
