
public class Cotxe {

	//Revisar W3Schoolorg
	//Atributs
	
	private boolean ac;
	
	/** Los modificadores en java son private
		private
		public 
		protected
		default
	*/
	
	
	//Constructor
	
	public Cotxe(String color, String marca, String model, float motor, boolean ac) {
		super(color,marca,model,motor);
		this.ac = 0; 
	}
	
	//Getter
	String 
	
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
