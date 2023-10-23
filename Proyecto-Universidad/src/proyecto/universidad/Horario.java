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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", año=" + año +
                ", ciclo=" + ciclo +
                ", horaInicio='" + horaInicio + '\'' +
                ", horaFin='" + horaFin + '\'' +
                '}';
    }
}