package proyecto.universidad;

import java.util.Arrays;

public class Universidad {
    private String nombre;
    private Sede[] sedes;
    private Facultad[] facultades;
    private String rector;

    public Universidad(String nombre, Sede[] sedes, Facultad[] facultades, String rector) {
        this.nombre = nombre;
        this.sedes = sedes;
        this.facultades = facultades;
        this.rector = rector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sede[] getSedes() {
        return sedes;
    }

    public void setSedes(Sede[] sedes) {
        this.sedes = sedes;
    }

    public Facultad[] getFacultades() {
        return facultades;
    }

    public void setFacultades(Facultad[] facultades) {
        this.facultades = facultades;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    @Override
   
