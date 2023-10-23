package proyecto.universidad;

import java.util.Arrays;

public class Facultad {
    private String id;
    private String nombreFacultad;
    private char pabellon;
    private Carrera[] carreras;
    private String decana;

    public Facultad() {
    }

    public Facultad(String id, String nombreFacultad, char pabellon, Carrera[] carreras, String decana) {
        this.id = id;
        this.nombreFacultad = nombreFacultad;
        this.pabellon = pabellon;
        this.carreras = carreras;
        this.decana = decana;
    }



    @Override
    public String toString() {
        return "Facultad" +
                "id='" + id + '\'' +
                ", nombreFacultad='" + nombreFacultad + '\'' +
                ", pabellon=" + pabellon +
                ", carreras=" + Arrays.toString(carreras) +
                ", decana='" + decana + '\'' +
                '}';
    }
}


