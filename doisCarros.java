import java.text.DecimalFormat;
import java.util.Scanner;

public class doisCarros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o valor em Km que o carro Y deve se distanciar do carro X");
		
		int km = input.nextInt();
        int minutos = 2 * km;
        System.out.println(minutos + " minutos");
        
	}

}
