import java.util.Scanner;

public class chatBot {

	public static void main(String[] args) {
		String resposta = "";
		double edatDouble = 0d;
		int edat = 0;

		System.out.println("Hola bon dia, com et dius?");
		Scanner entrada = new Scanner(System.in);
		resposta = entrada.nextLine();

		System.out.println("Hola "+resposta+" en que et puc ajudar?");
		resposta = entrada.nextLine();
		System.out.println("Ara mateix no puc ajudar-te amb "+resposta);

		System.out.println("Quina edat tens?");
		edat = entrada.nextInt();
		edatDouble = (double) edat / 3;

		System.out.println(edatDouble);
		
		System.out.println("Quins anys d'experiencia "
				+ "laboral tens=");
		resposta = entrada.next();
		edat = Integer.parseInt(resposta);
		System.out.println("Tens "+edat+" anys d'experiencia");
		
	}
}
