
public class ContaEspecial extends Conta {	
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double limite) {
		super(nomeTitular, cpf, numeroConta);
		this.limite=limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean Sacar(double valor) {
		if(saldo+limite>valor) {
			saldo=saldo-valor;
			return true;
		}else {
			return false;
		}
	}
	
	public String exibirInfo() {
		return "Cliente Especial: "+nomeTitular+ "\nCPF: "+ cpf + "\n" + "Número da Conta: " + numeroConta + 
				"\nSaldo: R$"+ String.format("%.2f\n", saldo)+"\nLimite: R$"+ String.format("%.2f\n", this.limite);
	}
	public String exibirSaldo() {
		return "\n" + "Saldo: R$"+ String.format("%.2f\n", saldo)+ "Saldo com o Limite Especial: R$"+ String.format("%.2f\n", limite+saldo) + "\n";
	}
}
