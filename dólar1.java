import java.text.DecimalFormat;
import java.util.Scanner;

public class d�lar1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o valor em Reais: ");
		
		double reais = input.nextDouble();
		
		double dolar = reais * 4.9749;
		
		System.out.println("O valor em d�lares a ser devolvido � de: " + df.format(dolar));
		
	}

}
