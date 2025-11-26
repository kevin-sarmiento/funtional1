package predicate;

import java.util.function.Predicate;
import java.util.List;
import java.util.Arrays;

public class Ejemplo2 {

    public static void main(String[] args) {
        // Predicate que verifica si un número es par
        Predicate<Integer> esPar = num -> num % 2 == 0;
        System.out.println("¿4 es par? " + esPar.test(4));
        System.out.println("¿7 es par? " + esPar.test(7));



        // Filtrar lista usando Predicate
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> pares = numeros.stream()
                .filter(esPar)
                .toList();
        System.out.println("Números pares: " + pares);
    }
}