package Folha;

import java.util.*;

import Funcionarios.*;

public class FolhaPagamentoACME {
	public static void main(String[] args) {
		
		/* Funcionario lista[] = new Funcionario[5];
		
		lista[0]=new Empreiteiro("Fábio Kimura", 105, 6300);
		lista[1]=new Chefe("Anibal Martinez", 101, 12000, 2.1, 950);
		lista[2]=new Comissionado("Jaqueline Almeida", 102, 4200, 4.25);
		lista[3]=new Horista("José Aparecido Ramos", 103, 8.73, 185);
		lista[4]=new Horista("Alexandre Gomes", 104, 8.73,205);
		
		for (int pos=0; pos < lista.length; pos++){
		System.out.println("Colaborador: "+ lista[pos].getNome() + " Salário: R$"+ String.format("%.2f\n",lista[pos].CalcularSalario()));
		}	
		*/
		
		ArrayList<Funcionario> lista=new ArrayList<Funcionario>();
		
		lista.add(new Empreiteiro("Fábio Kimura", 100, 6300));
		lista.add(new Chefe("Anibal Martinez", 101, 12000, 2.1, 950));
		lista.add(new Comissionado("Jaqueline Almeida", 102, 4200, 4.25));
		lista.add(new Horista("José Aparecido Ramos", 103, 8.73, 185));
		lista.add(new Horista("Alexandre Gomes", 104, 8.73,205));
		lista.add(new Chefe("Ricardo Cavalcante", 105, 10000, 6.89, 950));
		lista.add(new Comissionado("Silvana Alves Mendes", 106, 3900, 4.5));
		
		for (Funcionario f:lista) {
			System.out.println("Colaborador: " + f.getNome() + " Salário: R$"+ String.format("%.2f\n",f.CalcularSalario()));
		}		
	}
}
