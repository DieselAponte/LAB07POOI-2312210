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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public char getPabellon() {
        return pabellon;
    }

    public void setPabellon(char pabellon) {
        this.pabellon = pabellon;
    }

    public Carrera[] getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera[] carreras) {
        this.carreras = carreras;
    }

    public String getDecana() {
        return decana;
    }

    public void setDecana(String decana) {
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


