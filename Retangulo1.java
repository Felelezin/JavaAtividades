import java.util.Scanner;

public class Retangulo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio");
        int raio = input.nextInt();
        System.out.println("o valor da circunferência é: " + raio * raio * Math.PI);
	}

}
