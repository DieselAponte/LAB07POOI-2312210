package proyecto.universidad;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private int codigo;
    private List<Curso> cursos;
    private Nota[] notas;

    public Estudiante(int carnet, int dni, String nombre, String apellido, int edad, String correo, int telefono) {
        super(dni, nombre, apellido, edad, correo, telefono);
        this.codigo = carnet;
        this.cursos = new ArrayList<>();
        this.notas = new Nota[0];
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void asistencia(String registro) {
        System.out.println("Asistencia del estudiante " + getNombre() + " al curso: " + registro);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet=" + codigo +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", correo='" + getCorreo() + '\'' +
                ", telefono=" + getTelefono() +
                ", cursos=" + cursos +
                '}';
    }
}