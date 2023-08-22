import java.util.Scanner;

public class quadrantes1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a coordenada de X");
		
		int coorX = input.nextInt();
		
		System.out.println("Insira a coordenada de Y");
		
		int coorY = input.nextInt();
		
		if (coorX > 0 && coorY > 0) {
			
			System.out.println("X " + coorX + " Y " + coorY + " Quadrante 1");
		}
		
		else if (coorX < 0 && coorY > 0) {
			
			System.out.println("X " + coorX + " Y " + coorY + " Quadrante 2");
			
		}
		
		else if (coorX > 0 && coorY < 0) {
			
			System.out.println("X " + coorX + " Y " + coorY + " Quadrante 3");
			
		}
		
		else if (coorX < 0 && coorY < 0) {
			
			System.out.println("X " + coorX + " Y " + coorY + " Quadrante 4");
			
		}
		
		else if (coorX == 0) {
			
			System.out.println("Y " + coorY + " Sobre o eixo X");
			
		}
		
		else if (coorY == 0 ) {
			
			System.out.println("X " + coorX + " Sobre o eixo Y");
			
		}
		
		
		
		
		
		
		

	}

}
