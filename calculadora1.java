import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadora1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o primeiro n�mero: ");
		
		double num1 = input.nextDouble();
		
		System.out.println("Insira o segundo n�mero: ");
		
		double num2 = input.nextDouble();
		
		System.out.println("Escolha a opera��o desejada. 1 = soma | 2 = subtra��o | 3 = multiplica��o | 4 = divis�o");
		
		int operacao = input.nextInt();
		
		double soma = num1 + num2;
		
		double mult = num1 * num2;
		
		double div = num1 / num2;
		
		double sub = num1 - num2;
		
		if (operacao == 1)
		{System.out.println("o resultado da soma �: " + df.format(soma) );
		
		}
		
		else if (operacao == 2) {
			
			System.out.println("o resultado da subtra��o � de: " + df.format(sub));
			
		}
		
		else if (operacao == 3)
		
		
		{System.out.println("o resultado da multiplica��o � de: " + df.format(mult));
			
		}
		
		
		else if (operacao == 4) 
		
		{System.out.println("O resultado da divis�o � de: " + df.format(div));
			
		}
		
		
		else {System.err.println("Escolha um n�mero de opera��o valido"); 
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		}
		
		

	}

}
