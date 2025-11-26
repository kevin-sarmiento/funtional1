package tarea1;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // Crear lista de personas
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 22, "Bogotá"),
                new Persona("Ana", 17, "Cali"),
                new Persona("Carlos", 30, "Bogotá"),
                new Persona("Lucía", 25, "Medellín"),
                new Persona("Pedro", 19, "Barranquilla")
        );

        // 1️ Consumer → acción sobre cada elemento (mostrar nombres)
        Consumer<Persona> mostrarNombre = p -> System.out.println(p.getNombre());
        System.out.println("Nombres de todas las personas:");
        personas.forEach(p -> System.out.println(p.getNombre()));

        // Predicate → condición (filtrar mayores de edad)
        Predicate<Persona> esMayorDeEdad = p -> p.getEdad() >= 18;
        System.out.println("\nPersonas mayores de edad:");
        List<Persona> personasMayoresDeEdad = personas
                .stream()
                .filter(esMayorDeEdad)
                .toList();

        personas.stream()
                .filter(esMayorDeEdad)
                .forEach(System.out::println);

        //  Function → transforma Persona → String (solo nombres)
        Function<Persona, String> obtenerNombre = Persona::getNombre;
        List<String> nombres = personas.stream()
                .map(obtenerNombre)
                .toList();
        System.out.println("\nLista solo con nombres: " + nombres);

        //  Consumer → mensaje "Juan vive en Bogotá"
        Consumer<Persona> mensajeCiudad = p ->
                System.out.println(p.getNombre() + " vive en " + p.getCiudad());
        System.out.println("\nMensajes con ciudad:");
        personas.forEach(mensajeCiudad);

        //  Function → mensaje personalizado con edad
        Function<Persona, String> mensajeEdad =
                p -> "Hola " + p.getNombre() + ", tienes " + p.getEdad() + " años";
        System.out.println("\nMensajes con edad:");
        personas.stream()
                .map(mensajeEdad)
                .forEach(System.out::println);

        // Supplier → genera una Persona aleatoria
        Supplier<Persona> generarPersona = () -> {
            String[] nombresA = {"Sofía", "Luis", "María", "Andrés", "Valentina"};
            String[] ciudadesA = {"Bogotá", "Cali", "Medellín", "Barranquilla", "Cartagena"};
            Random r = new Random();
            String nombre = nombresA[r.nextInt(nombresA.length)];
            int edad = r.nextInt(60) + 10;
            String ciudad = ciudadesA[r.nextInt(ciudadesA.length)];
            return new Persona(nombre, edad, ciudad);
        };

        Persona aleatoria = generarPersona.get();
        System.out.println("\nPersona generada aleatoriamente:");
        System.out.println(aleatoria);

        // Function → nombres en mayúsculas
        Function<Persona, String> nombreMayus = p -> p.getNombre().toUpperCase();
        System.out.println("\nNombres en mayúsculas:");
        personas.stream()
                .map(nombreMayus)
                .forEach(System.out::println);

        //  Predicate → personas que viven en Bogotá
        Predicate<Persona> viveEnBogota = p -> p.getCiudad().equalsIgnoreCase("Bogotá");
        System.out.println("\nPersonas que viven en Bogotá:");
        personas.stream()
                .filter(viveEnBogota)
                .forEach(System.out::println);

        //  Function → mensaje final "Juan (22 años) es de Bogotá"
        Function<Persona, String> mensajeFinal = p ->
                p.getNombre() + " (" + p.getEdad() + " años) es de " + p.getCiudad();

        List<String> mensajes = personas.stream()
                .map(mensajeFinal)
                .toList();
        System.out.println("\nMensajes personalizados:");
        mensajes.forEach(System.out::println);
    }
}
