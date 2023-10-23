package proyecto.universidad;

import java.util.Arrays;

public class Profesor extends Persona {
    private int numHoras;
    private int aniosExperiencia;
    private Curso[] cursos;

    public Profesor(int dni, String nombre, String apellido, int edad, String correo, int telefono, int numHoras, int aniosExperiencia) {
        super(dni, nombre, apellido, edad, correo, telefono);
        this.numHoras = numHoras;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public double calcSalarioDiario(double numHoras) {
        return numHoras * 10; 
    }

    public void asignarCurso(Curso curso) {
        
    }


