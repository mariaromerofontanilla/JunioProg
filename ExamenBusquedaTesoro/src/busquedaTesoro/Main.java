package busquedaTesoro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BusquedaTesoro bus = new BusquedaTesoro();

		// bus.pintaTablero();

		String mover = "";

		int movimientoJugador = 0;

		// System.out.println();
		// System.out.print("La posicion del tesoro es: ");
		BusquedaTesoro.generaPosicionTesoro();

		//bus.pintaTablero();

		while (!bus.busquedaTesoro()) {
//			System.out.print("¿Hacia que posicion te quiere mover, (ARRIBA, ABAJO, IZQUIERDA, DERECHA)? ");
//			mover = sc.next();
//			bus.mueveJugador(mover);
			bus.pintaTablero();

			do {
				System.out.print("¿Hacia que posicion te quiere mover, (ARRIBA, ABAJO, IZQUIERDA, DERECHA)? ");
				mover = sc.next();
				
				movimientoJugador = bus.mueveJugador(mover);
				
				if(movimientoJugador == -1) {
					System.out.println("Ese movimiento no está dentro de los límites del tablero");
				} else if(movimientoJugador == -2) {
					System.out.println("Lo siento, pero no entiendo ese movimiento");
				}
				
			} while (movimientoJugador != 0);

			/*if (mover.equalsIgnoreCase("arriba") || mover.equalsIgnoreCase("abajo")
					|| mover.equalsIgnoreCase("izquierda") || mover.equalsIgnoreCase("derecha")) {

				System.out.print("¿Hacia que posicion te quiere mover, (ARRIBA, ABAJO, IZQUIERDA, DERECHA)? ");
				mover = sc.next();
				bus.mueveJugador(mover);
				bus.pintaTablero();

			} else {
				System.out.println("Lo siento, pero no entiendo ese movimiento.");

				System.out.print("¿Hacia que posicion te quiere mover, (ARRIBA, ABAJO, IZQUIERDA, DERECHA)? ");
				mover = sc.next();
				bus.mueveJugador(mover);
				bus.pintaTablero();
			}*/
		}

		System.out.println("ENHORABUENA ENCONTRASTE EL TESORO!!!!!!");

		sc.close();
	}

}
