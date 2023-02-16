import java.util.Scanner;

public class Concurs {
	
	public static void main(String[] args) {
		
		int numPc = 312;
		int numUser = 0;
		int intents = 3;
		
		Scanner entrada = new Scanner(System.in);
		while((numPc != numUser && intents > 0)) {
			
			System.out.println("Introduce un número entre el 1 y el 500");
			numUser = entrada.nextInt();
			
			if(numPc != numUser) {
				System.out.println(" El nombre es erroni.");
				intents--;
			}
			
		}
		if (intents == 0) {
			System.out.println("has excedit el nombre de intents");
		}else {
			System.out.println("Enhorabona has encertat.");
		}
		System.out.println("Enhorabuena");
	}

}
