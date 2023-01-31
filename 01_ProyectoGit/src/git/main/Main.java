package git.main;

import git.entidad.Direccion;
import git.entidad.Persona;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a nuestras versiones con Git");
		
		Persona p = new Persona();
		

		p.setNombre("Steve rogers");
		p.setEdad("45"); 
		
		System.out.println(p);
		
		Direccion d = new Direccion();
		d.setNombreVia("calle de la pllata");
		d.setTipoVia("calle");
		
		
		

	}

}
