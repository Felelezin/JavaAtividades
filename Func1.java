import java.text.DecimalFormat;
import java.util.Scanner;

public class Func1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira seu n�mero de funcion�rio: ");
		int numerofunc = input.nextInt();
		
		System.out.println("Insira o n�mero de horas trabalhadas por dia: ");
		int horasdia = input.nextInt();
		
		System.out.println("Insira o valor que voc� recebe por hora: ");
		double valorhora = input.nextDouble();
		
		double totalmes = (valorhora * horasdia) * 30;
		
		System.out.println("O funcion�rio: " + numerofunc + " " + "Recebe: " + df.format(totalmes)+ " por m�s");
		
		
	

	}

}
