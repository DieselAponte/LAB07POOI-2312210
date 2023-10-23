
package proyecto.universidad;

public class Nota {
    private Curso curso;
    private double calificacion;
    private String tipoNota;
    private String estadoNota;
    private double peso;

    public Nota(Curso curso, double calificacion, String tipoNota, String estadoNota, double peso) {
        this.curso = curso;
        this.calificacion = calificacion;
        this.tipoNota = tipoNota;
        this.estadoNota = estadoNota;
        this.peso = peso;
    }

    
}