package mvc;

import mvc.controller.Controlador;
import mvc.model.Modelo;
import mvc.view.Vista;

public class Launcher {
	
	public static void main(String[] args) {
		
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(modelo);
		Vista vista = new Vista(controlador);
		
		vista.crearVentana();
		
	}
}
