package proyecto.universidad;

import java.util.Arrays;

public class Carrera {
    private String id;
    private String nombreCarrera;
    private Curso[] cursos;
    private int ciclos;
    private String modalidad;

    public Carrera() {
    }

    public Carrera(String id, String nombreCarrera, Curso[] cursos, int ciclos, String modalidad) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.cursos = cursos;
        this.ciclos = ciclos;
        this.modalidad = modalidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public int getCiclos() {
        return ciclos;
    }

    public void setCiclos(int ciclos) {
        this.ciclos = ciclos;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id='" + id + '\'' +
                ", nombreCarrera='" + nombreCarrera + '\'' +
                ", cursos=" + Arrays.toString(cursos) +
                ", ciclos=" + ciclos +
                ", modalidad='" + modalidad + '\'' +
                '}';
    }
}