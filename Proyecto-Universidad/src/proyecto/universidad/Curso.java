package proyecto.universidad;

import java.util.Arrays;

public class Curso {
    private String bloque;
    private String formatoDictado;
    private Persona[] personas;
    private String aula;
    private Horario horario;
    private Carrera carrera;

    public Curso(String bloque, String formatoDictado, Persona[] personas, String aula, Horario horario) {
        this.bloque = bloque;
        this.formatoDictado = formatoDictado;
        this.personas = personas;
        this.aula = aula;
        this.horario = horario;
    }

    
}