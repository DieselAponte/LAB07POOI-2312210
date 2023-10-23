package proyecto.universidad;

public class Horario {
    private int dia;
    private int mes;
    private int año;
    private int ciclo;
    private String horaInicio;
    private String horaFin;

    public Horario() {
    }

    public Horario(int dia, int mes, int año, int ciclo, String horaInicio, String horaFin) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.ciclo = ciclo;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    
}