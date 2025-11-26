package consumer;

import java.util.function.*;
import java.util.*;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<Integer> mostrarPor10 = n -> System.out.println(n + " x 10 = " + (n * 10));

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(mostrarPor10);
    }
}
