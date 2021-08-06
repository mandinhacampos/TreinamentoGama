import java.util.Scanner;

public class HelloWorld {
    public static void main(String args []){
    	Scanner teclado = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Digite o valor de a");
        int a = teclado.nextInt();
        System.out.println("você digitou: " + a);
    }
}