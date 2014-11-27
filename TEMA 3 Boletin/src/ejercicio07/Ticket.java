package ejercicio07;

public class Ticket {

	/*1.Atributos*/
	
	private double precio;
	
	/*2.Constructores*/
	
	public Ticket (double precio){
		this.precio=precio;
	}
	
	public Ticket (){
		this.precio=0;
	}
	
	
	/*3.Get y Set*/
	
	
	public double getPrecio(){
		
		return precio;
	}
	
	public void setPrecio(double precio){
		this.precio=precio;
	}


	
	
	/*4.Métodos*/

    public String toString() {
		return "Ticket [precio=" + precio + "]";
	}


}