import java.util.Scanner;

public class modtest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número: ");
		int numeroA = input.nextInt();

		System.out.println("Insira o segundo número: ");
		int numeroB = input.nextInt();

		if (numeroA % numeroB == 0 || numeroB % numeroA == 0)

		{
			System.out.println("Os números são multiplos");

		}

		else {
			System.out.println("Os números não são multiplos");

		}

	}
}