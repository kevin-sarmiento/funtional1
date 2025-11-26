package bifunction;
import java.util.function.*;

public class EjemploBiFunction {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> promedio = (n1, n2) -> (n1 + n2) / 2;

        double res = promedio.apply(4.5, 3.8);
        System.out.println("El promedio es: " + res);
    }
}
