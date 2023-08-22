import java.text.DecimalFormat;
import java.util.Scanner;

public class Vendedor1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira seu nome: ");
		String nome = input.next();
		
		System.out.println("Insira seu salário mensal: ");
		double salario = input.nextDouble();
		
		System.out.println("Insira suas vendas mensais em R$: ");
		double vendas = input.nextDouble();
		
		double finalmes = salario + (vendas*0.15);
		

		System.out.println("O Vendedor " + nome + " recebe um total de R$" + df.format(finalmes));
		
	}

}
