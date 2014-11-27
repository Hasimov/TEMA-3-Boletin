package ejercicio07;


public class Maquina {


/*1.Atributos*/

private int ticketVend;
private double contraseña;
/*debe tener un atributo que sea ticket*/

/*2.Constructores*/


public Maquina(int ticketVend, double contraseña) {
	
	this.ticketVend = ticketVend;
	this.contraseña = contraseña;
}


/*3.Get y Set*/

public int getTicketVend() {
	return ticketVend;
}


public void setTicketVend(int ticketVend) {
	this.ticketVend = ticketVend;
}


public double getContraseña() {
	return contraseña;
}
public void setContraseña(double contraseña) {
	this.contraseña = contraseña;
}

/*4.Métodos*/

/*4. Acceso a la máquina*/
public boolean acceso (double pass){
	
	if(pass==contraseña){
		return true;
	}
	else{
		return false;
	}
}

/*4.2 Vender Ticket*/

public double venderTicket (double dinero, int numTicket){
	
	double total;
	
	Ticket Ticket1 = new Ticket();
	
	total = numTicket*(Ticket1.getPrecio());
	
	ticketVend++;
	return total;
	
}

/*4.3 Devolver cambio*/
 
 public double devolverCambio (double dinero, int numTicket){
	
	 double cambio;
	 
	 cambio = dinero-venderTicket(dinero, numTicket);
	 
	return cambio;
 }


}



