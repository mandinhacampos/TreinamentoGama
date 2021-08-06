
public class Loja {
	public static void main(String[] args) {
		Carro c1, c2;
		c1=new Carro();
		c2=new Carro();
		
		c1.ano=2018;
		c1.marca="Renault";
		c1.modelo="Duster";
		c1.cor="Marrom";
		c1.preco=61999;
		
		c2.ano=2013;
		c2.marca="Fiat";
		c2.modelo="Palio";
		c2.cor="Branco";
		c2.preco=31499;
		
		c1.exibirInfo();
		c2.exibirInfo();
		
		c1.aplicarDesconto(8);
		c2.aplicarDesconto(10.0);
		
		System.out.println("---- Aplicados Descontos ----");
		c1.exibirInfo();
		c2.exibirInfo();
	}
}
