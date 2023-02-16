
public class Vehicle {

	//Revisar W3Schoolorg
	//Atributs
	
	private String color = "";
	private String marca = "";
	private String model = "";
	private float motor = 0f;
	private int velocitat = 0;
	
	/** Los modificadores en java son private
		private
		public 
		protected
		default
	*/
	
	
	//Constructor
	
	public Vehicle(String color, String marca, String model, float motor) {
		this.color = color;
		this.marca = marca;
		this.model = model;
		this.motor = motor;
		this.velocitat = 0; 
	}
	
	//Getter
	String getColor() {
		return this.color;
	}
	
	String getMarca() {
		return this.marca;
	}
	
	String getModel() {
		return this.model;
	}
	
	float getmotor() {
		return this.motor;
	}
	
	//Setter
	void setColor(String color) {
		this.color = color;
	}
	
	void setMarca(String marca) {
		this.marca = marca;
	}
	
	void setModel (String model) {
		this.model = model;
	}
	
	void setMotor (float motor) {
		this.motor = motor;
	}
	
	
	//metodes generals
	
	public void accelerar() {
		this.velocitat += 10;
	}
	
	public void frenar() {
		this.velocitat -= 5;
	}
	
	
	//Metode propi
	public String toString() {
		return "Soc un cotxe de color " + this.color + " de la marca " + this.marca + " i model " + this.model + " amb un motor " + this.motor;
	}
}
