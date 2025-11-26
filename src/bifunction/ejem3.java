package bifunction;

import java.util.function.BiFunction;

public class ejem3{

    public static void main(String[] args) {
        // BiFunction que concatena dos Strings
        BiFunction<String, String, String> concatenar = (texto1, texto2) -> texto1 + " " + texto2;
        System.out.println(concatenar.apply("Java", "8"));

        // BiFunction que suma dos números
        BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
        System.out.println("Suma: " + sumar.apply(10, 5));

    }
}
