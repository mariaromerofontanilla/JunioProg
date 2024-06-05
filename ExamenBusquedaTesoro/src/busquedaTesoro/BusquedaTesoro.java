package busquedaTesoro;

import java.util.Random;

public class BusquedaTesoro {

	public final static int TAM_TABLERO = 5;

	public static int xTesoro;

	public static int yTesoro;

	public int xJugador = 1;

	public int yJugador = 1;

	public BusquedaTesoro() {

	}

	public static void generaPosicionTesoro() {
		Random rand = new Random();

		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);

		System.out.println(xTesoro + "," + yTesoro);
	}

	public void pintaTablero() {
		for (int i = 1; i < TAM_TABLERO + 1; i++) {
			System.out.print("\t" + i);
		}
		for (int i = 1; i < TAM_TABLERO + 1; i++) {
			System.out.print("\n" + i);

			if (xJugador == i) {
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				System.out.print("J");
			}
			System.out.println();

		}

	}

	public int mueveJugador(String direccion) {
		/*
		 * int devolver; String arriba = "ARRIBA"; String abajo = "ABAJO"; String
		 * derecha = "DERECHA"; String izquierda = "IZQUIERDA";
		 * 
		 * if (movimiento > TAM_TABLERO) { devolver = -1; } else if (movimiento <
		 * TAM_TABLERO) { devolver = 0; movimiento = xJugador; movimiento = yJugador; }
		 * else if (!direccion.equals(arriba) || !direccion.equals(abajo) ||
		 * !direccion.equals(derecha) || !direccion.equals(izquierda)) {
		 * 
		 * devolver = -2;
		 * 
		 * }
		 * 
		 * return movimiento;
		 */

		int devolver = 0;

		String direccionMinus = direccion.toLowerCase();

		switch (direccionMinus) {
		case "arriba":

			if ((xJugador - 1) < 1) {
				devolver = -1;
			} else {
				xJugador--;
			}

			break;

		case "abajo":

			if ((xJugador + 1) > TAM_TABLERO) {
				devolver = -1;
			} else {
				xJugador++;
			}

			break;

		case "izquierda":

			if ((yJugador - 1) < 1) {
				devolver = -1;
			} else {
				yJugador--;
			}

			break;

		case "derecha":

			if ((yJugador + 1) > TAM_TABLERO) {
				devolver = +1;
			} else {
				yJugador++;
			}

			break;

		default:
			devolver = -2;
			
			break;

		}

		return devolver;
	}

	public boolean busquedaTesoro() {
		boolean encontrado = false;

		if (xJugador == xTesoro && yJugador == yTesoro) {
			encontrado = true;
		} else {
			encontrado = false;
		}

		return encontrado;
	}

}