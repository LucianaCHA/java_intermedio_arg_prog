package inscripciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validador {

	public static void main(String[] args) {
		// sin materias
		Estudiante es_hugo_c = new Estudiante("hugo", "cipollati",new ArrayList<ListaMaterias>());		
		//con una que sirve de correlativa
		Estudiante es_carlos_g = new Estudiante("carlos", "garcia",Arrays.asList(ListaMaterias.ANALISIS_I));
		
		//  con una que no sirve de correlativa
				Estudiante es_pedro_a = new Estudiante("pedro", "aznar",Arrays.asList(ListaMaterias.ALGEBRA_LINEAL, ListaMaterias.FISICA_I));
				
		Inscripcion inscripcion1 = new Inscripcion(es_carlos_g, ListaMaterias.ANALISIS_II);
		Inscripcion inscripcion2 = new Inscripcion(es_hugo_c, ListaMaterias.ALGEBRA_LINEAL);
		Inscripcion inscripcion3 = new Inscripcion(es_pedro_a, ListaMaterias.BIOQUIMICA_II);
		
		
		System.out.println(validate(inscripcion1));
		System.out.println(validate(inscripcion2));
		System.out.println(validate(inscripcion3));

	}
	
	public static String validate(Inscripcion inscripcion) {
		if(inscripcion.aprobada()) {
			return "Inscripciòn Aprobada, felicitaciones " + inscripcion.getEstudiante();
		}
		return inscripcion.getEstudiante() + " Inscripciòn rechazada no cumple correlativas de " + inscripcion.getMateria();
	}

}
