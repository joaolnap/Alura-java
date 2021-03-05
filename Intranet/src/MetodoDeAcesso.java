
public class MetodoDeAcesso implements AcessoRestrito{
	
	private int senha;
	
	@Override
	public boolean autorizacao(int senha) {
		if(this.senha==senha) {
			return true;
		}else
		return false;
	}
	@Override
	
	public int getSenha() {
		return senha;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
