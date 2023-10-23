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

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public String getFormatoDictado() {
        return formatoDictado;
    }

    public void setFormatoDictado(String formatoDictado) {
        this.formatoDictado = formatoDictado;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "bloque='" + bloque + '\'' +
                ", formatoDictado='" + formatoDictado + '\'' +
                ", personas=" + Arrays.toString(personas) +
                ", aula='" + aula + '\'' +
                ", horario=" + horario +
                ", carrera=" + carrera +
                '}';
    }
}