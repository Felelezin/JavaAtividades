import java.text.DecimalFormat;
import java.util.Scanner;

public class algoritimomodvar1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira o número desejado: ");

		double num = input.nextDouble();

		System.out.println(
				"Escolha a operação desejada: 1 = somar 10 2 = subtrair 10 3 = multiplicar 10 4 = dividir por 10");

		int conta = input.nextInt();

		if (conta > 4 || conta <= 0) {

			System.err.println("Escolha uma operação válida");

		}

		if (conta == 1) {

			num = num + 10;

			System.out.println("O resultado é: " + df.format(num));

		}

		if (conta == 2) {

			num = num - 10;

			System.out.println("O resultado é: " + df.format(num));

		}

		if (conta == 3) {

			num = num * 10;

			System.out.println("O resultado é: " + df.format(num));

		}

		if (conta == 4) {

			num = num / 10;

			System.out.println("O resultado é: " + df.format(num));

		}

	}

}
