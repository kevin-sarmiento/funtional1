package supplier;
import java.util.function.*;
import java.util.*;

public class EjemploSupplier {
    public static void main(String[] args) {
        Supplier<String> generarPassword = () -> {
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder pass = new StringBuilder();
            Random r = new Random();
            for (int i = 0; i < 6; i++) {
                pass.append(caracteres.charAt(r.nextInt(caracteres.length())));
            }
            return pass.toString();
        };

        System.out.println("Contraseña generada: " + generarPassword.get());
    }
}
