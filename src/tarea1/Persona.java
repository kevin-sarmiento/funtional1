package tarea1;

public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    // Constructor
    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Método toString()
    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - " + ciudad;
    }
}
