package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Vla");

        if (personas != null) {
            for (Persona persona : personas) {
                System.out.println(persona.nombre() + " " + persona.apellido());
            }
        }
        else{
            System.out.println("no se encontro a la persona");
        }

        var opcPersona = repo.buscarId(1L);

        if (opcPersona.isPresent()) {
            Persona persona = opcPersona.get();
            System.out.println(persona.nombre() + " " + persona.apellido());
        }
    }
}