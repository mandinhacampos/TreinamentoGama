
public class Carro {
	
	int ano;
	String modelo, marca, cor;
	double preco;
	
	void exibirInfo() {
		System.out.println(("Autom�vel "+ marca + " " + modelo));
		System.out.println("Cor:" + cor + " - Ano:" + ano); 
		System.out.printf("Pre�o: R$%.2f\n",preco);
		System.out.println();
	}
	
	void aplicarDesconto(double percentual) {
		preco=preco-(preco*percentual/100);
	}

}
