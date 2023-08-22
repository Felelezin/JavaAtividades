import java.text.DecimalFormat;
import java.util.Scanner;

public class tresDuplaPrecisao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o valor A");
		double valorA = input.nextDouble();
		
		System.out.println("Insira o valor B");
		double valorB = input.nextDouble();
		
		System.out.println("Insira o valor C");
		double valorC = input.nextDouble();
		
		
		
		System.out.println("A área do retangulo que possui A por base e C por altura é de: " + df.format((valorA * valorC) / 2));
			
		System.out.println("A área do circulo que possui C como raio é de: " + df.format(Math.PI * valorC * valorC));
		
		System.out.println("A área do trapezio que tem A e B por base e C por altura é de: " + df.format((valorA + valorB) * valorC / 2));
		
		System.out.println("A área do quadrado que tem lado B é de: " + (df.format(valorB * valorB)));
		
		System.out.println("A área do retângulo que tem lados A e B é de: " + (df.format(valorA * valorB)));
		
		
	}

}
