
public class Funcionario {
	
	private int numeroFuncional;
	private String nome, email;
	private double salario;
	
		
	public void reajustarSalario(double valor) {
		salario=salario+(salario*valor/100);
	}
	
	public Funcionario(int numeroFuncional,String nome, String email, double salario) {
		this.numeroFuncional=numeroFuncional;
		this.nome= nome;
		this.email = email;
		this.salario=salario;
		
	}
	public String exibirInfo() {
		return "Funcionário: "+nome+ (" (Funcional: "+numeroFuncional) + ")\n" + "E-mail: "+email+ 	"\n" + "Salário: R$"+ salario+ "\n" ;
	}
	
		
	public double calcularImposto() {
		if(salario<=2000.00){
			return 0.00;
		} else if(salario>2000 && salario<=3000){
			return salario*0.15;
		} else if(salario>3000 && salario<=4500){
			return salario*0.25;
		} else {
			return 2250;
		}
					
}
					
	public int getnumeroFuncional() {
		return numeroFuncional;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public double getSalario() {
		return salario;
	}
	public void setnumeroFuncional(int anumeroFuncional) {
		this.numeroFuncional = anumeroFuncional;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
