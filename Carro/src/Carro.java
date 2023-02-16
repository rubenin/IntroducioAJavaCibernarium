import java.util.ArrayList;

public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] productes = {"patatas", "peras", "pipas",  "pomelos", "chocolate"};
		System.out.println(productes[2]);
		productes [2] = "kikos";
		System.out.println(productes[2]);
		
		//bucle for para mostrar todo el array
		for (String producte : productes) {
			System.out.println(producte);
		}
		
		//ArrayList
		ArrayList <String> carro = new ArrayList <String> ();
		carro.add("Pantalons");
		carro.add("Rotulador");
		
		System.out.println(carro.get(0));
		carro.set(0,"Goma");
		System.out.println(carro.get(0));
		System.out.println(carro);
		

	}

}
