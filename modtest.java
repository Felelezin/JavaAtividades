import java.util.Scanner;

public class modtest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		int numeroA = input.nextInt();

		System.out.println("Insira o segundo n�mero: ");
		int numeroB = input.nextInt();

		if (numeroA % numeroB == 0 || numeroB % numeroA == 0)

		{
			System.out.println("Os n�meros s�o multiplos");

		}

		else {
			System.out.println("Os n�meros n�o s�o multiplos");

		}

	}
}