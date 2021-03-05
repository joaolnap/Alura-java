
public class Teste {

	public static void main(String[] args) {
		Professor professor= new Professor();
		professor.autorizacao(222);
		
		
		IntranetFaculdade acesso = new IntranetFaculdade();
		acesso.autenticacao(professor);
	

	}

}
