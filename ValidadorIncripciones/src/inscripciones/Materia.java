package inscripciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Materia {
	private ListaMaterias nombre;
	private List<ListaMaterias> correlativas;
	
	public static final List<ListaMaterias> BIOQUIMICA_I = new ArrayList<ListaMaterias>();
    public static final List<ListaMaterias> BIOQUIMICA_II = Arrays.asList(ListaMaterias.BIOQUIMICA_I);
    public static final List<ListaMaterias> ALGEBRA_LINEAL = new ArrayList<ListaMaterias>();
    public static final List<ListaMaterias> ANALISIS_I = new ArrayList<ListaMaterias>();
    public static final List<ListaMaterias> ANALISIS_II = Arrays.asList(ListaMaterias.ANALISIS_I);
    public static final List<ListaMaterias> FISICA_I = Arrays.asList(ListaMaterias.ALGEBRA_LINEAL);
    public static final List<ListaMaterias> TECNICAS_ANALITICAS = Arrays.asList(ListaMaterias.FISICA_I);
    

    public static List<ListaMaterias> getCorrelativas(ListaMaterias materia) {
        switch (materia) {
            case BIOQUIMICA_I:
                return BIOQUIMICA_I;
            case BIOQUIMICA_II:
                return BIOQUIMICA_II;
            case ALGEBRA_LINEAL:
                return ALGEBRA_LINEAL;
            case ANALISIS_I:
            	
                return ANALISIS_I;
            case ANALISIS_II:         
                return ANALISIS_II;
            case FISICA_I:
                return FISICA_I;
            case TECNICAS_ANALITICAS:
                return TECNICAS_ANALITICAS;
            default:
                return null;
        }
    }
    	
    
	public Materia(ListaMaterias nombre,List<ListaMaterias> correlativas) {
		super();
		this.nombre = nombre;
		this.correlativas = Constantes.getCorrelativas(nombre);
	}

	public ListaMaterias getNombre() {
		return this.nombre;
	}

	public void setNombre(ListaMaterias nombre) {
		this.nombre = nombre;
	}

	public List<ListaMaterias> getCorrelativas() {
		return Constantes.getCorrelativas(nombre);
	}
	
	
	
		
}