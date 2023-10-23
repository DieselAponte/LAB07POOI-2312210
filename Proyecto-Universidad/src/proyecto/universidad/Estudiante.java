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

    
}