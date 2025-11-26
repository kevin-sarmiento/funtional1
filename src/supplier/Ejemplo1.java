package supplier;

import java.util.function.Supplier;
import java.time.LocalDateTime;

class Ejemplo2 {

    public static void main(String[] args) {
        // Supplier que genera la fecha y hora actual
        Supplier<LocalDateTime> fechaActual = () -> LocalDateTime.now();
        System.out.println("Fecha actual: " + fechaActual.get());

        // Supplier que genera un número aleatorio
        Supplier<Double> numeroAleatorio = () -> Math.random() * 100;
        System.out.println("Número aleatorio: " + numeroAleatorio.get());

        // Supplier que crea un nuevo String
        Supplier<String> mensaje = () -> "Hola desde Supplier!";
        System.out.println(mensaje.get());
    }
}