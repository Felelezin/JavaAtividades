import java.util.Scanner;

public class idadeHF1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira a idade do primeiro homem");

		int hom1 = input.nextInt();

		System.out.println("Insira a idade do segundo homem");

		int hom2 = input.nextInt();

		System.out.println("Insira a idade da primeira mulher");

		int mul1 = input.nextInt();

		System.out.println("Insira a idade da segunda mulher");

		int mul2 = input.nextInt();

		boolean hom1M = true;

		boolean mul1M = true;

		if (hom2 > hom1) {

			hom1M = false;

		}

		if (mul2 > mul1) {

			mul1M = false;

		}
		
		if (mul1 == mul2 || mul1 == hom1 || hom2 == mul2 || hom1 == hom2 || hom1 == mul2 || hom2 == mul1) {
			
			System.err.println("Insira idades diferentes para cada um");
			
		}
		
		if (hom1M && mul1M) {
			
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (hom1 + mul2));
			
			System.out.println("O produto da idade da mulher mais velha com o homem mais novo é: " + (mul1 * hom2));
			
		}

		else if (!hom1M && mul1M) {
			
System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (hom2 + mul2));
			
			System.out.println("O produto da idade da mulher mais velha com o homem mais novo é: " + (mul1 * hom1));
		}
		
		else if (hom1M && !mul1M) {
			
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (hom1 + mul1));
						
						System.out.println("O produto da idade da mulher mais velha com o homem mais novo é: " + (mul2 * hom2));
						
		}
						
						else if (!hom1M && !mul1M) {
							
							System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (hom2 + mul1));
										
										System.out.println("O produto da idade da mulher mais velha com o homem mais novo é: " + (mul2 * hom1));
		
	}

}
	
}
