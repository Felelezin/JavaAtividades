import java.util.Scanner;

public class NomeIfeElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu primeiro nome");
		
		String nome = input.next();
		
		System.out.println("Insira seu sobrenome");
		
		String sobrenome = input.next();
		
		String nomecompleto = nome + " " + sobrenome;
		
		
		if (nomecompleto.equalsIgnoreCase("Felipe Domingos"))
		{
			System.out.println("Correto");
		}
		
		else {System.out.println("Errado");
		
		}

	}

}
