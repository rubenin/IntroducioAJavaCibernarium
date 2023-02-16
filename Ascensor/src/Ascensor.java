import java.util.Scanner;

public class Ascensor {

	public static void main(String[] args) {
		int planta = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("A qué planta quieres ir");

		planta = entrada.nextInt();

		switch(planta) {
		case 1:
			System.out.println("Moda infantil");
			break;
		case 2:
			System.out.println("Electrodomésticos");
			break;
		case 3:
			System.out.println("Moda adultos");
			break;
		default:
			System.out.println("Escoge una planta entre 1, 2 y 3");
			break;
		}
	}

}
