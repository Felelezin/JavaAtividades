import java.util.Scanner;

public class g�meos1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Insira o ano que nasceu o primeiro irm�o: ");
		
		int irmao1 = input.nextInt();
		
		System.out.println("Insira o ano que nasceu o segundo irm�o: ");
		
		int irmao2 = input.nextInt();
		
		System.out.println("Insira o ano que nasceu o terceiro irm�o: ");
		
		int irmao3 = input.nextInt();
		
		if (irmao1 == irmao2 && irmao2 == irmao3) {
			
			System.out.println("Trig�meos");
		}
		
		else if (irmao1 == irmao2 && irmao3 !=irmao2 || irmao1 == irmao3 && irmao1 != irmao2 || irmao2 == irmao3 && irmao2 != irmao1) {
			System.out.println("G�meos");
			
			}
		
		else if (irmao1 != irmao2 && irmao2 != irmao3) {
			System.out.println("Apenas irm�os");
		}
			
		

	}

}
