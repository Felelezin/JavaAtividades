import java.text.DecimalFormat;
import java.util.Scanner;

public class algoritimomodvar1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira o n�mero desejado: ");

		double num = input.nextDouble();

		System.out.println(
				"Escolha a opera��o desejada: 1 = somar 10 2 = subtrair 10 3 = multiplicar 10 4 = dividir por 10");

		int conta = input.nextInt();

		if (conta > 4 || conta <= 0) {

			System.err.println("Escolha uma opera��o v�lida");

		}

		if (conta == 1) {

			num = num + 10;

			System.out.println("O resultado �: " + df.format(num));

		}

		if (conta == 2) {

			num = num - 10;

			System.out.println("O resultado �: " + df.format(num));

		}

		if (conta == 3) {

			num = num * 10;

			System.out.println("O resultado �: " + df.format(num));

		}

		if (conta == 4) {

			num = num / 10;

			System.out.println("O resultado �: " + df.format(num));

		}

	}

}
