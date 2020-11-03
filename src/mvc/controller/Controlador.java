package mvc.controller;

import mvc.model.Modelo;

public class Controlador {

	private Modelo modelo;
	private String opcionCPU;

	public Controlador(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public String obtenerOpcionCPU() {
		opcionCPU = modelo.obtenerOpcionCPU();
		return opcionCPU;
	}
	
	
}
