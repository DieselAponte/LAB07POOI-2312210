import java.util.Arrays;
import java.util.List;
import proyecto.universidad.Administrador;
import proyecto.universidad.Carrera;
import proyecto.universidad.Curso;
import proyecto.universidad.Estudiante;
import proyecto.universidad.Facultad;
import proyecto.universidad.Horario;
import proyecto.universidad.Nota;
import proyecto.universidad.Persona;
import proyecto.universidad.Profesor;
import proyecto.universidad.RegistroNota;


public class TestPrincipal {
    public static void main(String[] args) {
        // Creación de instancias
        Profesor profesor = new Profesor(654321, "Alexander", "Benites", 40, "alex@example.com", 987654321, 40, 15);
        System.out.println(profesor);

        Estudiante estudiante = new Estudiante(98765, 73894389, "Luis", "Darien", 20, "luis@example.com", 987654321);
        System.out.println(estudiante);

        Administrador administrador = new Administrador(75678999, "Jesus", "Camargo", 35, "Jesus@example.com", 123456789, "Jefe", 5);
        System.out.println(administrador);

        Carrera carrera = new Carrera("C1", "Ingenieria", new Curso[0], 0, "Presencial");
        System.out.println(carrera);

        Curso curso = new Curso("B2", "Virtual", new Persona[0], "Aula 101", new Horario());
        System.out.println(curso);

        Facultad facultad = new Facultad("F1", "Ingenieria", 'A', new Carrera[0], "Decano");
        System.out.println(facultad);

        Horario horario = new Horario(1, 1, 2023, 1, "8:00 AM", "10:00 AM");
        System.out.println(horario);

        Nota nota = new Nota(curso, 18.5, "Parcial", "Aprobado", 0.2);
        System.out.println(nota);

        RegistroNota registroNota = new RegistroNota(1, profesor, new Estudiante[0]);
        System.out.println(registroNota);

       
        estudiante.agregarCurso(curso);
        estudiante.asistencia("Registro de asistencia");

        profesor.asignarCurso(curso);
        profesor.mandarCorreo("Mensaje de prueba");
    }
}