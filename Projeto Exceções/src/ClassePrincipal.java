import java.util.*;

public class ClassePrincipal {
	public static void main(String[] args) {
		
		try {
		Scanner teclado= new Scanner (System.in);
		System.out.println("Digite um valor para A:");
		int a= teclado.nextInt();
		System.out.println("Digite um valor para B:");
		int b= teclado.nextInt();
		
		int resultado= a/b;
		
		System.out.println("O resultado da equação é: " + resultado);
		
		teclado.close();	
		}
		
		catch(InputMismatchException e) {
			System.out.println("AVISO: o valor digitado deve ser um numero inteiro!");
		}
		
		catch(ArithmeticException e) {
			System.out.println("AVISO: erro aritimético, o denominador deve ser inteiro diferente de 0 (zero)");
		}
			
		catch(Exception e) {
			System.out.println("Ops.. o valor digitado é inválido!");
			System.out.println("Favor entrar em contato com a central de atendimento e reportar o seguinte código de falha:"+e.getClass().getName());
		}
	}
}
