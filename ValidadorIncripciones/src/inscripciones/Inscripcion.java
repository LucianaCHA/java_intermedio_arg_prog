package inscripciones;

import java.util.List;

public class Inscripcion {
	private Estudiante estudiante;
	private ListaMaterias materia;
	
	public Inscripcion(Estudiante estudiante, ListaMaterias materia) {
		super();
		this.estudiante = estudiante;
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public ListaMaterias getMateria() {
		return materia;
	}

	public void setMateria(ListaMaterias materia) {
		this.materia = materia;
	}
	
	public boolean aprobada() {
		List<ListaMaterias> materiasAprobadas = estudiante.getMateriasAprobadas();
		if (materiasAprobadas.containsAll(Constantes.getCorrelativas(materia))) {
			return true;
		}
		return false;			
	}	

}
