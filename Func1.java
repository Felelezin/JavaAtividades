import java.text.DecimalFormat;
import java.util.Scanner;

public class Func1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira seu número de funcionário: ");
		int numerofunc = input.nextInt();
		
		System.out.println("Insira o número de horas trabalhadas por dia: ");
		int horasdia = input.nextInt();
		
		System.out.println("Insira o valor que você recebe por hora: ");
		double valorhora = input.nextDouble();
		
		double totalmes = (valorhora * horasdia) * 30;
		
		System.out.println("O funcionário: " + numerofunc + " " + "Recebe: " + df.format(totalmes)+ " por mês");
		
		
	

	}

}
