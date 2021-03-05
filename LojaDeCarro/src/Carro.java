
public class Carro {
	private int ano;
	private String modelo;
	private double preco;
	private static int total =0;

	public Carro(int ano, String modelo, double preco) {
		total++;
		if(ano>=1891) {
			this.ano=ano;
		}else {
			System.out.println("Ano informado é invalido");
		}
		
		if(modelo!=null) {
			this.modelo=modelo;
			
		}else {
			System.out.println("Modelo não foi informado");
		}
		
		if(preco>0) {
			this.preco=preco;
		}else {
			System.out.println("informe um preço corretamente");
		}
		this.ano = ano;
		this.modelo = modelo;
		this.preco = preco;

	}

	public Carro(String modelo, double preco) {
		this(2017,modelo,preco);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static int getTotal() {
		return Carro.total;
	}

}
