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
		
		
		
		System.out.println("A �rea do retangulo que possui A por base e C por altura � de: " + df.format((valorA * valorC) / 2));
			
		System.out.println("A �rea do circulo que possui C como raio � de: " + df.format(Math.PI * valorC * valorC));
		
		System.out.println("A �rea do trapezio que tem A e B por base e C por altura � de: " + df.format((valorA + valorB) * valorC / 2));
		
		System.out.println("A �rea do quadrado que tem lado B � de: " + (df.format(valorB * valorB)));
		
		System.out.println("A �rea do ret�ngulo que tem lados A e B � de: " + (df.format(valorA * valorB)));
		
		
	}

}
