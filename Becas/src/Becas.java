import java.util.Scanner;

public class Becas {

	public static void main(String[] args) {
		int edat = 0;
		String edatTipus = "";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuál es tu edad?");
		edat = entrada.nextInt();

		
		edatTipus = (edat >= 18) ? "major" : "menor";
		System.out.println("eres "+edatTipus);
	}

}
