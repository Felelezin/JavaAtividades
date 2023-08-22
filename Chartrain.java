import java.util.Scanner;

public class Chartrain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu gênero, entre M para masculino, F para Feminino e I para não informar ");
		char genero = input.next().charAt(0);
		genero = Character.toUpperCase(genero);
		if (genero == 'M') {
			System.out.println("Masculino");
		}
			
			else if (genero == 'F') {
				
				System.out.println("Feminino");
				
			}
		
			else if (genero == 'I') {
				
				System.out.println("Não Informado");
			}
				
				else {
					
					System.err.println("Entrada Incorreta");
				}
			
			
		}

	}


