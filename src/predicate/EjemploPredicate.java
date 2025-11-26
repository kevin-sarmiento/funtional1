package predicate;
import java.util.function.*;
import java.util.*;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<String> empiezaConA = palabra -> palabra.startsWith("A");

        List<String> palabras = Arrays.asList("Arbol", "Sol", "Agua", "Luna");
        for (String p : palabras) {
            if (empiezaConA.test(p)) {
                System.out.println(p + " empieza con A");
            }
        }
    }
}
