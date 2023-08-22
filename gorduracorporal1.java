import java.text.DecimalFormat;
import java.util.Scanner;

public class gorduracorporal1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira seu peso em KG: ");
		
		double peso = input.nextDouble();
		
		System.out.println("Insira sua altura em M: ");
		
		double alt = input.nextDouble();
		
		double tot = peso / (alt * alt);
		
		if (tot <= 18.5) {
			
			System.out.println("O resultado do seu IMC é: Magreza");
			
		} 
		
		else if (tot > 18.5 && tot <= 24.9) {
			
			System.out.println("O resultado do seu IMC é: Saudável");
		}
		
		else if (tot >= 25.0 && tot <= 29.9) {
			
			System.out.println("O resultado do seu IMC é: Sobrepeso");
		}
		
else if (tot >= 30.0 && tot <= 34.9) {
			
			System.out.println("O resultado do seu IMC é: Obesidade Grau I");
		}
		
else if (tot >= 35.0 && tot <= 39.9) {
	
	System.out.println("O resultado do seu IMC é: Obesidade Grau II (severa)");
}
		
else if (tot >= 40) {
	
	System.out.println("O resultado do seu IMC é: Obesidade Grau III (morbida)");
	
}

		
		
		
		
		
		

	}

}
