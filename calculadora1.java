import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadora1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o primeiro número: ");
		
		double num1 = input.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		
		double num2 = input.nextDouble();
		
		System.out.println("Escolha a operação desejada. 1 = soma | 2 = subtração | 3 = multiplicação | 4 = divisão");
		
		int operacao = input.nextInt();
		
		double soma = num1 + num2;
		
		double mult = num1 * num2;
		
		double div = num1 / num2;
		
		double sub = num1 - num2;
		
		if (operacao == 1)
		{System.out.println("o resultado da soma é: " + df.format(soma) );
		
		}
		
		else if (operacao == 2) {
			
			System.out.println("o resultado da subtração é de: " + df.format(sub));
			
		}
		
		else if (operacao == 3)
		
		
		{System.out.println("o resultado da multiplicação é de: " + df.format(mult));
			
		}
		
		
		else if (operacao == 4) 
		
		{System.out.println("O resultado da divisão é de: " + df.format(div));
			
		}
		
		
		else {System.err.println("Escolha um número de operação valido"); 
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		}
		
		

	}

}
