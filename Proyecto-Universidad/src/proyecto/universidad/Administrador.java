package proyecto.universidad;

public class Administrador extends Persona {
    private String rango;
    private int oficina;
    private int adminID;

    public Administrador(int dni, String nombre, String apellido, int edad, String correo, int telefono, String rango, int oficina) {
        super(dni, nombre, apellido, edad, correo, telefono);
        this.rango = rango;
        this.oficina = oficina;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public void programarReunion(String decision) {
   
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "rango='" + rango + '\'' +
                ", oficina=" + oficina +
                ", adminID=" + adminID +
                "} " + super.toString();
    }
}

