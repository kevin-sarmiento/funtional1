package biconsumer;

import java.util.function.BiConsumer;
import java.util.Map;
import java.util.HashMap;

public class ejem7 {

    public static void main(String[] args) {
        // BiConsumer que imprime dos valores
        BiConsumer<String, Integer> imprimirPar = (nombre, edad) ->
                System.out.println(nombre + " tiene " + edad + " años");
        imprimirPar.accept("Juan", 25);

        // BiConsumer que realiza operaciones matemáticas
        BiConsumer<Double, Double> operaciones = (a, b) -> {
            System.out.println("Suma: " + (a + b));
            System.out.println("Resta: " + (a - b));
            System.out.println("Multiplicación: " + (a * b));
        };
        operaciones.accept(10.0, 3.0);


    }
}