package ejercicio07;

public class Ppal07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*7. 	Crear un programa que emule una máquina vendedora de tickets de metro.
				Tendremos que crear la clase ticket, la clase máquina y la clase principal o de
				prueba. Podremos:
				*Comprar uno o varios billetes teniendo en cuenta si hay que devolver cambio o no.
				*Imprimir por pantalla el billete.
				*Además, al final de la jornada, el operario que lleva el mantenimiento de la máquina, 
				debe tener disponible un método que le ofrezca el saldo total de la recaudación de la máquina en ese día 
				(no es necesario usar fechas) y ponga a cero el contador.
				*Por último, también debe contar con la posibilidad de cambiar el precio
				de los billetes ya que estos suelen subir todos los años.
				*Las operaciones para el operario se harán solo si se introduce la
				contraseña adecuada.*/
		
		int opc = 0, numticket,contraseña=1234;
		

		System.out.println("Bienvenido al servicio de venta de tickets automático del metro de Sevilla.\n¿Qué operación desea realizar?");

		System.out.println("1.Para comprar un ticket\n2.Configuración");
		opc =Leer.datoInt();
		
		switch (opc) {
		case 1: System.out.println("¿Cuántos tickets desea comprar?");
		      	numticket=Leer.datoInt();

			break;
		case 2: System.out.println("Introduzca la contraseña de administrador");
      	contraseña=Leer.datoInt();

      		break;

		default:
			break;
		}

	}

}
