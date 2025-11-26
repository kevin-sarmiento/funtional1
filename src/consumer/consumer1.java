package consumer;

import java.util.function.Consumer;

public class consumer1 {

    public static void main(String[] args) {
        // Consumer que imprime un String
        Consumer<String> imprimir = texto -> System.out.println("Texto: " + texto);
        imprimir.accept("Hola Mundo");

        // Consumer que procesa un número
        Consumer<Integer> procesarNumero = num -> {
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
        };
        procesarNumero.accept(5);
    }
}