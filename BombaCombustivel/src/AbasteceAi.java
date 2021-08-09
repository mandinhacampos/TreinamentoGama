import java.util.Scanner;
public class AbasteceAi {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String combustivel;
		int opcao, opcombustivel;
		double precoLitro, qtdeLitro, totalPagar;
		
		BombaDeCombustivel diesel, gasolina, etanol;
		diesel= new BombaDeCombustivel("Diesel", 4.49);
		gasolina=new BombaDeCombustivel("Gasolina", 5.69);
		etanol=new BombaDeCombustivel("Etanol", 4.19);		
		
			System.out.println("Bem vindo ao Posto de Combustiveis da IsidroCorp Gas & Energy");				
			System.out.println("Escolha uma das opções de combustíveis: 1.Diesel 2.Gasolina 3.Etanol");
			opcombustivel=teclado.nextInt();
			if(opcombustivel==1) {
					System.out.println("Certo, seu combustível é DIESEL./n Como deseja abastecer? 1. Por Litro? 2. Por Valor (R$)?");
					opcao=teclado.nextInt();
					switch (opcao) {
					case 1: 
						System.out.println("Qual a quantidade de litro?");
						qtdeLitro=teclado.nextDouble();
						diesel.abastecerPorLitro(qtdeLitro);
						diesel.exibirRecibo();
						break;
					case 2:
						System.out.println("Qual o valor em reais?");
						totalPagar=teclado.nextDouble();
						diesel.abastecerPorValor(totalPagar);
						diesel.exibirRecibo();
						break;
				} 
			}


			if(opcombustivel==2) {
					System.out.println("Certo, seu combustível é GASOLINA. /n Como deseja abastecer? 1. Por Litro? 2. Por Valor (R$)?");
					opcao=teclado.nextInt();
					switch (opcao) {
					case 1:
							System.out.println("Qual a quantidade de litro?");
							qtdeLitro=teclado.nextDouble();
							gasolina.abastecerPorLitro(qtdeLitro);
							gasolina.exibirRecibo();
							break;
					case 2:	
							System.out.println("Qual o valor em reais?");
							totalPagar=teclado.nextDouble();
							gasolina.abastecerPorValor(totalPagar);
							gasolina.exibirRecibo();
							break;
				}
			}
							
			if(opcombustivel==3) {
				System.out.println("Certo, seu combustível é ETANOL. /n Como deseja abastecer? 1. Por Litro? 2. Por Valor (R$)?");
				opcao=teclado.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("Qual a quantidade de litro?");
					qtdeLitro=teclado.nextDouble();
					etanol.abastecerPorLitro(qtdeLitro);
					etanol.exibirRecibo();
					break;
					
				case 2:	
					System.out.println("Qual o valor em reais?");
					totalPagar=teclado.nextDouble();
					etanol.abastecerPorValor(totalPagar);
					etanol.exibirRecibo();
					break;
				}
			}	
		if(opcombustivel>3) { System.out.println("Opção não é válida!");}
		
		
	}
	
}

