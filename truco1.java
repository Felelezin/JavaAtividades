import java.util.Scanner;

public class truco1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira a primeira carta");
		
		int carta1 = input.nextInt();
		
System.out.println("insira a segunda carta");
		
		int carta2 = input.nextInt();
		
System.out.println("insira a terceira carta");
		
		int carta3 = input.nextInt();
		
		boolean carta1V = false;
		boolean carta2V = false;
		boolean carta3V = false;

		if (carta1 ==1 || carta1 ==2 || carta1 ==3 ) {
			
			carta1V = true;
			
		}
if (carta2 ==1 || carta2 ==2 || carta2 ==3 ) {
			
			carta2V = true;
			
		}
if (carta3 ==1 || carta3 ==2 || carta3 ==3 ) {
	
	carta3V = true;
	
}

if (carta1V && carta2V && carta3V) {
	
	System.out.println("NOVE!!!");
	
}

else if (carta1V && carta2V && !carta3V || carta1V && !carta2V && carta3V || !carta1V && carta2V && carta3V){
	
	System.out.println("SEIS!!");
	
}

else if (!carta1V && !carta2V && carta3V || carta1V && !carta2V && !carta3V || !carta1V && carta2V && !carta3V) {
	
	System.out.println("TRUCO!!!");
	
}

		
		
	}

}
