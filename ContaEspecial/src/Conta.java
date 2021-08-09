
public class Conta {

	protected String nomeTitular, cpf;
	protected int numeroConta;
	protected double saldo;
	
	
	public Conta(String nomeTitular, String cpf, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}

	public String exibirInfo() {
		return "Cliente: "+nomeTitular+ "\nCPF: "+ cpf + "\n" + "Número da Conta: " + numeroConta + "\nSaldo: R$"+ String.format("%.2f\n", saldo);
	}
	
	public String exibirSaldo() {
		return "\n" + "Saldo: R$"+ saldo+ "\n" ;
	}
	
	public double Depositar(double valor) {
		saldo=saldo+valor;
		return this.saldo;
	}
	
	public boolean Sacar(double valor) {
		if(saldo>valor) {
			saldo=saldo-valor;
			return true;
		}else {
			return false;
		}
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
