import java.util.Scanner;

public class Chartrain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu g�nero, entre M para masculino, F para Feminino e I para n�o informar ");
		char genero = input.next().charAt(0);
		genero = Character.toUpperCase(genero);
		if (genero == 'M') {
			System.out.println("Masculino");
		}
			
			else if (genero == 'F') {
				
				System.out.println("Feminino");
				
			}
		
			else if (genero == 'I') {
				
				System.out.println("N�o Informado");
			}
				
				else {
					
					System.err.println("Entrada Incorreta");
				}
			
			
		}

	}


