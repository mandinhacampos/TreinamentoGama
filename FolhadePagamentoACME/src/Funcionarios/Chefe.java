package Funcionarios;

public class Chefe extends Funcionario {

	private double salarioBase;
	private double adicional;
	private double beneficioTerno;
	
	
	public Chefe(String nome, int numeroRegistro, double salarioBase, double adicional, double beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicional = adicional;
		this.beneficioTerno = beneficioTerno;
	}

	public double CalcularSalario(){
		return salarioBase+(salarioBase*adicional/100)+beneficioTerno;
				
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
}
