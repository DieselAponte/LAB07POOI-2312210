
package proyecto.universidad;

import java.util.Arrays;

public class RegistroNota {
    private int id;
    private Profesor profesor;
    private Estudiante[] Estudiante;
    private double notaMinima = 0.0;
    private double notaMaxima = 20.0;
    private double notaMinimaAprobacion = 10.5;

    public RegistroNota() {
    }

    public RegistroNota(int id, Profesor profesor, Estudiante[] Estudiante) {
        this.id = id;
        this.profesor = profesor;
        this.Estudiante = Estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante[] getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(Estudiante[] Estudiante) {
        this.Estudiante = Estudiante;
    }

    public double getNotaMinima() {
        return notaMinima;
    }

    public double getNotaMinimaAprobacion() {
        return notaMinimaAprobacion;
    }
    
    public double getNotaMaxima() {
        return notaMaxima;
    }

    

    @Override
    public String toString() {
        long[] estudiante = null;
        return "RegistroNota{" +
                "id=" + id +
                ", profesor=" + profesor +
                ", estudiante=" + Arrays.toString(estudiante) +
                ", notaMinima=" + notaMinima +
                ", notaMaxima=" + notaMaxima +
                ", notaMinimaAprobacion=" + notaMinimaAprobacion +
                '}';
    }
}