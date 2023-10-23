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

    
}