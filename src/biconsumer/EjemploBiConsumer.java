package biconsumer;
import java.util.function.*;

public class EjemploBiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, Double> mostrarProducto = (nombre, precio) ->
                System.out.println("Producto: " + nombre + " - Precio: $" + precio);

        mostrarProducto.accept("Camiseta", 45_000.0);
        mostrarProducto.accept("Zapatos", 120_000.0);
    }
}
