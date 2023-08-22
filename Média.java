import java.text.DecimalFormat;
import java.util.Scanner;

public class Média {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		
		System.out.println("Insira a nota 1");
		double nota1 = input.nextDouble();
		
		System.out.println("Insira a nota 2");
		double nota2 = input.nextDouble();
		
		System.out.println("Insira a nota 3");
		double nota3 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3) /3;

		
		System.out.println("A média é de: " + df.format(media));
	}

}
