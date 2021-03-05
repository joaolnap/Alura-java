
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		EditorDeVideo editor = new EditorDeVideo();
		editor.setSalario(2000);
		
		Designer designer = new Designer();
		designer.setSalario(3000);
		
		Funcionario funcionario = new Gerente();
		funcionario.setSalario(1000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registrar(designer);
		controle.registrar(editor);
		
		System.out.println(controle.getSoma());
		System.out.println(designer.getBonificacao());
		System.out.println(designer.getSalario());
	}
	
	
	

}
