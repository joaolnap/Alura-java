
public class TestandoCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro(2017,"Gol",40000);
		Carro carro2 = new Carro("Gol",40000);
		
		System.out.println(carro2.getAno());
		System.out.println(Carro.getTotal());
	}

}
