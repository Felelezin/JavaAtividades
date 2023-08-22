import java.util.Scanner;

public class gêmeos1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Insira o ano que nasceu o primeiro irmão: ");
		
		int irmao1 = input.nextInt();
		
		System.out.println("Insira o ano que nasceu o segundo irmão: ");
		
		int irmao2 = input.nextInt();
		
		System.out.println("Insira o ano que nasceu o terceiro irmão: ");
		
		int irmao3 = input.nextInt();
		
		if (irmao1 == irmao2 && irmao2 == irmao3) {
			
			System.out.println("Trigêmeos");
		}
		
		else if (irmao1 == irmao2 && irmao3 !=irmao2 || irmao1 == irmao3 && irmao1 != irmao2 || irmao2 == irmao3 && irmao2 != irmao1) {
			System.out.println("Gêmeos");
			
			}
		
		else if (irmao1 != irmao2 && irmao2 != irmao3) {
			System.out.println("Apenas irmãos");
		}
			
		

	}

}
