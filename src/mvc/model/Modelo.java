package mvc.model;

public class Modelo {

	private String[] opciones = { "Piedra", "Papel", "Tijera", "Lagarto", "Spock" };
	private int numeroAleatorio;
	private String opcionCPU;

	/*
	 * Genera un numero aleatorio entre 0 y 4
	 * y retorna lo que hay en esa posicion del array opciones
	 * 
	 * otra forma de hacerlo es:
	 * hacer shuffle al array y devolver la primera posicion
	 * */
	public String obtenerOpcionCPU() {
		numeroAleatorio = (int) (Math.random() * 5);
		opcionCPU = opciones[numeroAleatorio];
		System.out.println(opciones[numeroAleatorio]);
		return opcionCPU;
	}

}
