package ejercicio07;

public class Ppal07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*7. 	Crear un programa que emule una m�quina vendedora de tickets de metro.
				Tendremos que crear la clase ticket, la clase m�quina y la clase principal o de
				prueba. Podremos:
				*Comprar uno o varios billetes teniendo en cuenta si hay que devolver cambio o no.
				*Imprimir por pantalla el billete.
				*Adem�s, al final de la jornada, el operario que lleva el mantenimiento de la m�quina, 
				debe tener disponible un m�todo que le ofrezca el saldo total de la recaudaci�n de la m�quina en ese d�a 
				(no es necesario usar fechas) y ponga a cero el contador.
				*Por �ltimo, tambi�n debe contar con la posibilidad de cambiar el precio
				de los billetes ya que estos suelen subir todos los a�os.
				*Las operaciones para el operario se har�n solo si se introduce la
				contrase�a adecuada.*/
		
		int opc = 0, numticket,contrase�a=1234;
		

		System.out.println("Bienvenido al servicio de venta de tickets autom�tico del metro de Sevilla.\n�Qu� operaci�n desea realizar?");

		System.out.println("1.Para comprar un ticket\n2.Configuraci�n");
		opc =Leer.datoInt();
		
		switch (opc) {
		case 1: System.out.println("�Cu�ntos tickets desea comprar?");
		      	numticket=Leer.datoInt();

			break;
		case 2: System.out.println("Introduzca la contrase�a de administrador");
      	contrase�a=Leer.datoInt();

      		break;

		default:
			break;
		}

	}

}
