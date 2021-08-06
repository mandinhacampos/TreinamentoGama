import java.util.*;

public class Operacoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
		ContaCorrente c1;
		c1=new ContaCorrente();
					
		c1.setAg(1001);
		c1.setConta(10000);
		c1.setCpf("123.456.678-90");
		c1.setDac(1);
		c1.setNome("João da Silva");
		c1.setSaldo(100);
		
		do {
			System.out.println("Bem vindo ao Rosa NeoBank - Seu banco na net");
			System.out.println("Escolha uma das opções abaixo: \n 1-Info, 2-Deposito, 3-Saque e 0-Sair");
			opcao=teclado.nextInt();
			switch(opcao) {
				case 1:
					System.out.println();
					System.out.println(c1.exibirInfo());
					System.out.println();
					break;
				case 2:
					System.out.println("[DEPOSITO] Digite o Valor:");
					valor=teclado.nextDouble();
					c1.Depositar(valor);
					System.out.println(c1.exibirSaldo());
					break;
				case 3:
					System.out.println("[SAQUE] Digite o Valor:");
					valor=teclado.nextDouble();
					if (c1.Sacar(valor)){
						System.out.println("Saque Autorizado");
						System.out.println(c1.exibirSaldo());
					} else {
						System.out.println("Saldo Insuficiente");
						System.out.println(c1.exibirSaldo());
					}
					break;
				case 0:	
					System.out.println();
					System.out.println("Obrigado pela preferência!");
					System.out.println();
					break;
				default:
					System.out.println();
					System.out.println("ERRO: Opção Inválida");
					
			};
			
		} while (opcao !=0);
		
		teclado.close();				
	}
}
