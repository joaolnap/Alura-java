
public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha =2222;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSenha(int Senha) {
		this.senha=Senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		
		if(this.senha==senha) {
			return true;
		}else {
			return false;
		}
	}

}
