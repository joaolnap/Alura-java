
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(4448, 442048);
		cc.deposita(100);
		cc.saca(80);
		
		ContaPoupanca cp = new ContaPoupanca(4449,442049);
		cp.deposita(200);
		cp.transfere(80, cc);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
