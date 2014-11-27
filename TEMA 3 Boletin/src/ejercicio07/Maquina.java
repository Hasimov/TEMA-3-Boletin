package ejercicio07;


public class Maquina {


/*1.Atributos*/

private int ticketVend;
private double contrase�a;
/*debe tener un atributo que sea ticket*/

/*2.Constructores*/


public Maquina(int ticketVend, double contrase�a) {
	
	this.ticketVend = ticketVend;
	this.contrase�a = contrase�a;
}


/*3.Get y Set*/

public int getTicketVend() {
	return ticketVend;
}


public void setTicketVend(int ticketVend) {
	this.ticketVend = ticketVend;
}


public double getContrase�a() {
	return contrase�a;
}
public void setContrase�a(double contrase�a) {
	this.contrase�a = contrase�a;
}

/*4.M�todos*/

/*4. Acceso a la m�quina*/
public boolean acceso (double pass){
	
	if(pass==contrase�a){
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



