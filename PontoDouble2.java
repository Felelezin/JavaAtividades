import java.text.DecimalFormat;
import java.util.Scanner;

public class PontoDouble2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Insira o valor A: ");
		double valorA = input.nextDouble();
		
		System.out.println("Insira o valor B: ");
		double valorB = input.nextDouble();
		
		double totalA = valorA * 3.5;
		
		System.out.println("A média ponderada do valor A é: " + df.format(totalA));
		
		double totalB = valorB * 6.5;
		
		System.out.println("A média ponderada do valor B é: " + df.format(totalB));
		
		double totalnota = totalA + totalB;
		
		double totalfinal = totalnota / 10;
		
		System.out.println("O total é: " + df.format(totalfinal));
				
				
		
	
		
		
		

	}

}
