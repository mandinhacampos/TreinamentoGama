
public class ContaCorrente {

	private int ag, conta, dac;
	private String nome, cpf;
	private double saldo;
	
	public String exibirInfo() {
		return "Cliente: "+nome+ (" (CPF: "+cpf) + ")\n" + "Agencia:" + ag + " Conta:"+ conta +"-"+dac + "\n" + "Saldo: R$"+ saldo+ "\n" ;
	}
	
	public String exibirSaldo() {
		return "\n" + "Saldo: R$"+ saldo+ "\n" ;
	}
	
	public double Depositar(double valor) {
		saldo=saldo+valor;
		return saldo;
	}
	
	public boolean Sacar(double valor) {
		if(saldo>valor) {
			saldo=saldo-valor;
			return true;
		}else {
			return false;
		}
	}

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getDac() {
		return dac;
	}

	public void setDac(int dac) {
		this.dac = dac;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
}
