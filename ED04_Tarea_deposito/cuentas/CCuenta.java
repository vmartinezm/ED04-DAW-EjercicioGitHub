package cuentas;

/**
 * La clase CCuenta establece las cuentas bancarias (objetos) que se van a crear
 * y gestionar en el progama
 * 
 * @author Víctor Martínez Maciá
 * @version 1.5
 * @since 1.0
 *
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * El método getNombre es el método get del atributo nombre de la clase
	 * CCcuenta. Permite conocer el nombre del titular de un objeto cuenta bancaria
	 * que creemos en el programa
	 * 
	 * @since 1.0
	 * @return nombre del titular de la cuenta
	 *
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * El método setNombre es el método set del atributo nombre de la clase
	 * CCcuenta. Permite establecer que el valor pasado por parámetro es el nombre
	 * que va a tener un objeto cuenta bancaria que vayamos a crear en el programa.
	 * En este caso, el nombre de su titular.
	 * 
	 * @since 1.0
	 * @param nombre El parámetro define el nombre del titular de la cuenta bancaria
	 *
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * El método getCuenta es el método get del atributo cuenta de la clase
	 * CCcuenta, que es un identificador para cada cuenta bancaria. Permite conocer
	 * ese identificador
	 * 
	 * @since 1.0
	 * @return identificador de la cuenta bancaria
	 *
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * El método setCuenta es el método set del atributo cuenta de la clase
	 * CCcuenta. Permite establecer que el valor pasado por parámetro es el
	 * identificador que va a tener un objeto cuenta bancaria que vayamos a crear en
	 * el programa.
	 * 
	 * @since 1.0
	 * @param cuenta El parámetro define el identificador de la cuenta bancaria
	 *
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * El método getSaldo es el método get del atributo saldo de la clase CCcuenta,
	 * que es la cantidad de dinero disponible en una cuenta bancaria. Permite
	 * conocer el saldo
	 * 
	 * @since 1.0
	 * @return dinero disponible en la cuenta
	 *
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * El método setSaldo es el método set del atributo saldo de la clase CCcuenta.
	 * Permite establecer que el valor pasado por parámetro es el saldo que va a
	 * tener disponible un objeto cuenta bancaria que vayamos a crear en el
	 * programa.
	 * 
	 * @since 1.0
	 * @param saldo El parámetro define el dinero disponible en la cuenta bancaria
	 *
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * El método getTipoInterés es el método get del atributo tipoInterés de la
	 * clase CCcuenta, que es un posible precio del dinero (precio a pagar por
	 * utilizar una cantidad de dinero durante un tiempo determinado). El tipo de
	 * interés indica el porcentaje de que se debe pagar como contraprestación por
	 * utilizar una cantidad determinada de dinero en una operación financiera.
	 * 
	 * El método permite conocer el tipo de interés.
	 * 
	 * @since 1.0
	 * @return tipo de interés aplicado a una determinada operación en la cuenta
	 *         bancaria
	 *
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * El método setTipoInteres es el método set del atributo tipoInterés de la
	 * clase CCcuenta. Permite establecer que el valor pasado por parámetro es el
	 * tipo de interés que va a tener una operación que vamos a realizar con un
	 * objeto cuenta que vayamos a crear en el programa.
	 * 
	 * @since 1.0
	 * @param tipoInterés El parámetro define el tipo de interés de una operación
	 *
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Implementa el constructor por defecto, que crea una instancia de objeto. Es
	 * decir, crea una cuenta bancaria
	 * 
	 * @since 1.0
	 *
	 */
	public CCuenta() {
	}

	/**
	 * Implementa un constructor que crea una instancia de objeto con una serie de
	 * valores. Es decir, crea una cuenta bancaria y asigna a sus atributos los
	 * valores que pasamos por parámetro
	 * 
	 * @since 1.0
	 * @param nom  Asigna el valor de este parámetro al atributo nombre del objeto
	 *             cuenta
	 * @param cue  Asigna el valor de este parámetro al atributo cuenta del objeto
	 *             cuenta
	 * @param sal  Asigna el valor de este parámetro al atributo saldo del objeto
	 *             cuenta
	 * @param tipo El valor de este parámetro no se guarda en ningún atributo
	 *
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * El método estado devuelve, valga la redundancia, el estado en que se
	 * encuentra una cuenta bancaria. O dicho de otra forma, el dinero disponible en
	 * una cuenta en un momento dado.
	 * 
	 * @since 1.0
	 * @return dinero disponible en la cuenta bancaria
	 *
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * El método ingresar permite añadir una cantidad que se sume al saldo en ese
	 * momento de una cuenta bancaria.
	 * 
	 * @since 1.0
	 * @param cantidad El valor de este parámetro es la cantidad que vamos a sumar
	 *                 al saldo disponible en la cuenta bancaria en el momento del
	 *                 ingreso
	 * @exception Exception El método no nos permite ingresar una cantidad negativa,
	 *                      por lo que lanzará un mensaje de error si lo intentamos
	 *
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * El método retirar permite retirar una cantidad de la cuenta bancaria, para
	 * poder tenerla en efectivo. El saldo quedará actualizado restando la cantidad
	 * que hemos retirado.
	 * 
	 * @since 1.0
	 * @param cantidad El valor de este parámetro es la cantidad que vamos a restar
	 *                 al saldo disponible en la cuenta bancaria en el momento del
	 *                 la retirada
	 * @exception Exception El método no nos permite retirar una cantidad negativa,
	 *                      por lo que lanzará un mensaje de error si lo intentamos
	 * @exception Exception El método no nos permite retirar una cantidad mayor al
	 *                      saldo disponbile en la cuenta en ese momento, por lo que
	 *                      lanzará un mensaje de error si lo intentamos
	 *
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
