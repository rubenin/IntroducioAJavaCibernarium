import java.util.Scanner;

public class Disco {

	public static void main(String[] args) {

		int edat = 0;
		int dia = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("que día es hoy?");
		dia = entrada.nextInt();
		if (dia != 4) {
			System.out.println("Hoy no es jueves");


			System.out.println("Digues la teva edat?");
			edat = entrada.nextInt();

			if(edat >= 18) {
				System.out.println("puedes pasar");
			}else if(edat == 0){
				System.out.println("Tienes que decirme una edad válida");
			}else {
				System.out.println("no Puedes pasar");
			}
		}else{
			if (dia == 4) {
				System.out.println("Hoy es jueves, adelante");

			}
		}
	}
}




