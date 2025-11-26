package function;

import java.util.function.Function;

class EjemploFunction {

    public static void main(String[] args) {
        // Function que convierte String a mayúsculas
        Function<String, String> aMayusculas = texto -> texto.toUpperCase();
        System.out.println(aMayusculas.apply("java"));

        // Function que calcula la longitud de un String
        Function<String, Integer> longitud = texto -> texto.length();
        System.out.println("Longitud: " + longitud.apply("programación"));

        // Function que convierte String a Integer
        Function<String, Integer> convertirEntero = texto -> Integer.parseInt(texto);
        System.out.println("Número: " + convertirEntero.apply("123"));
    }
}