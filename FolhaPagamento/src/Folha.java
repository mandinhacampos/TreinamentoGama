	import java.util.Scanner;
public class Folha {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int opcao;
			double valor;
			
			Funcionario f1, f2, f3;
			f1=new Funcionario();
			f2=new Funcionario();
			f3=new Funcionario();
			
			f1.setnumeroFuncional(1);
			f2.setnumeroFuncional(2);
			f3.setnumeroFuncional(3);
			
			f1.setNome("Amanda Rosa");
			f1.setEmail("amanda.rosa@rosbank.com.br");
			f1.setSalario(1900);
			f2.setNome("Rafael Rosa");
			f2.setEmail("Rafael.rosa@rosbank.com.br");
			f2.setSalario(3500);
			f3.setNome("Heitor Rosa");
			f3.setEmail("heitor.rosa@rosbank.com.br");
			f3.setSalario(5000);
			
			f1.reajustarSalario(5);
			f2.reajustarSalario(8);
			f3.reajustarSalario(10);
			
			System.out.println();			
			System.out.println("   Nome           Salário (R$)        Imposto Devido (R$)");
			System.out.println();
			System.out.println(f1.getNome() + "        " + f1.getSalario() + "              " + f1.calcularImposto() );
			System.out.println();  
			System.out.println(f2.getNome() + "        " + f2.getSalario() + "              " + f2.calcularImposto() );
			System.out.println();
			System.out.println(f3.getNome() + "        " + f3.getSalario() + "              " + f3.calcularImposto() );
			
						
					
			teclado.close();				
			}
}
