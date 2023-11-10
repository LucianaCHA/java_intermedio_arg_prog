package inscripciones;

import java.util.List;

public class Estudiante {
	private String nombre;
	private String apellido;
	private static int legajo = 1;
	private List<ListaMaterias> materiasAprobadas;
	
			
	Estudiante(){
        legajo = Estudiante.legajo++;
    }

	public Estudiante(String nombre, String apellido,List<ListaMaterias> materiasAprobadas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.materiasAprobadas = materiasAprobadas;
		legajo = Estudiante.legajo++;
	}
	
	public String toString() {
        return legajo + " Nombre : " + nombre + " Apellido : " + apellido ;
    }

	public List<ListaMaterias> getMateriasAprobadas() {
		return materiasAprobadas;
	}

}