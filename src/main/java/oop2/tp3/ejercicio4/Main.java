package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        List<Persona> personas = null;
        try {
            personas = repo.buscarPorNombre("Vla");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (personas != null) {
            for (Persona persona : personas) {
                System.out.println(persona.nombre() + " " + persona.apellido());
            }
        }

        Persona persona = null;

        try {
            persona = repo.buscarId(1L);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (persona != null) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }
    }
}
