
public class Saludar {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String nom = "Ruben";
		String resposta = saludar (nom);
		System.out.println(resposta);

	}
	
	public static String saludar(String nom) {
		return "Hola, que tal? Com estas " +nom;
	}

}
