import java.util.Scanner;

public class Concurs {

	public static void main(String[] args) {

		int numPc = 312;
		int numUser = 0;
		int intents = 3;
		int diferencial = 0;
		String resposta = "";

		Scanner entrada = new Scanner(System.in);
		while((numPc != numUser && intents > 0)) {

			System.out.println("Introduce un número entre el 1 y el 500");
			numUser = entrada.nextInt();

			if(numPc != numUser) {
				System.out.println(" El nombre es erroni.");
				//Logica termometre
				diferencial = numPc - numUser;
				if (diferencial > 0 && diferencial <= 10) {
					resposta = "Calent, calent, el teu nombre és més petit.";
				}else if (diferencial < 0 && diferencial <= -10);
					resposta = "calent, calent, el teu nombre és més gran.";
				}else if (diferencial > 10 && diferencial <=20) {
					resposta = "tebi, tebi, el teu nombre és mes petit.";
				}else if (diferencial < -10 && diferencial >= -20) {
					resposta = "Tebi, tebi, el teu nombre és mes gran.";
				}else if (diferencial > 20) {
					resposta = "Fred, fred, el teu nombre és mes petit.";
				}else if(diferencial < -20) {
					resposta = "Fred, fred, el teu nombre es mes gran";
				}
			System.out.println(resposta);
			intents--;

		}


		if (intents == 0) {
			System.out.println("has excedit el nombre de intents");
		}else {
			System.out.println("Enhorabona has encertat.");
		}
		System.out.println("Enhorabuena");
	}
}

