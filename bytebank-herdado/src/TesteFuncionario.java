
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Gerente();
		
		nico.setNome("Nicolas");
		nico.setCpf("00022233344");
		nico.setSalario(1200.00);
		
		System.out.println(nico.getBonificacao());
		

	}

}
