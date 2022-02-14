package cuentas;

/**
 * La clase main es una clase en la que simplemente se va a implementar el
 * método main, que iniciará la ejecución del programa
 * 
 * @author Víctor Martínez Maciá
 * @version 1.5
 * @since 1.0
 *
 */
public class Main {

	/**
	 * El método main inicia el programa. Tan solo va a contener dentro una llamada
	 * a un método
	 * 
	 * @since 1.0
	 *
	 */
	public static void main(String[] args) {
		operativa_cuenta();
	}

	/**
	 * El método operativa_cuenta establece toda la operativa que se va a hacer con
	 * una cuenta bancaria.
	 * 
	 * En primer lugar, establece un objeto cuenta1 de tipo Cuenta, y una variable
	 * SaldoActual de tipo double. En segundo lugar, construye el objeto cuenta1
	 * gracias a uno de los constructores implementados en la clase CCcuenta. En
	 * tercer lugar, a la variable SaldoActual le asigna el valor que consigue con
	 * el método estado del objeto cuenta1 (método establecido en la clase CCuenta).
	 * En cuarto lugar, muestra por pantalla un mensaje con el saldo actual de la
	 * cuenta
	 * 
	 * En quinto lugar, intenta retirar una cantidad, utilizando el método retirar
	 * del objeto cuenta1 (método establecido en la clase CCuenta). En sexto y
	 * último lugar, intenta ingresar una cantidad, utilizando el método ingresar
	 * del objeto cuenta1 (método establecido en la clase CCuenta).
	 * 
	 * @since 1.0
	 *
	 */
	private static void operativa_cuenta() {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
