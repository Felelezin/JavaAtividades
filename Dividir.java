import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Insira o valor A");
	int valorA = input.nextInt();
	
	System.out.println("Insira o valor B");
	int valorB = input.nextInt();
	
	System.out.println("Insira o valor C");
	int valorC = input.nextInt();
	
	System.out.println("Insira o valor D");
	int valorD = input.nextInt();
	
	int somaAB = valorA * valorB;
			System.out.println("A soma AB �: " + somaAB);
			
			int somaCD = valorC * valorD;
			System.out.println("A soma CD �: " + somaCD);
			
			int diferen�a = somaAB - somaCD;
			System.out.println("A diferen�a entre eles �: " + diferen�a);
	
	}
		
		

}
