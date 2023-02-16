import java.util.Scanner;

public class DiscoExercisi {

	public static void main(String[] args) {

		int edat = 0;
		String dia = "";
		Scanner entrada = new Scanner(System.in);



		System.out.println("que edad tienes?");
		edat = entrada.nextInt();
		System.out.println("que día es hoy");
		dia = entrada.next();

		if((edat >= 18) || (dia.equalsIgnoreCase("jueves") && edat >= 16)){
			System.out.println("puedes pasar");
		}else if(edat == 0){
			System.out.println("Tienes que decirme una edad válida");
		}else {
			System.out.println("no Puedes pasar");

		}
	}
}



