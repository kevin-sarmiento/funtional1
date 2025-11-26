package function;
import java.util.function.*;

class function1 {
    public static void main(String[] args) {
        Function<Double, Double> celsiusAFahrenheit = c -> (c * 9 / 5) + 32;

        double resultado = celsiusAFahrenheit.apply(25.0);
        System.out.println("25°C = " + resultado + "°F");
    }
}
