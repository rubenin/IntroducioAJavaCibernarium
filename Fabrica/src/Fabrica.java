
public class Fabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = new Vehicle("Verd","Kia","Ceed",1.6f);
		vehicle1.setColor("vermell");
		System.out.println(vehicle1.getColor());
		System.out.println(vehicle1.toString());
	}

}
