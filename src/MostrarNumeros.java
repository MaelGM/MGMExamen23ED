import java.util.Scanner;
public class MostrarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingresa el primer número:");
        double numero1 = sc.nextDouble();

        System.out.println("Ahora, ingresa el segundo número:");
        double numero2 = sc.nextDouble();

        System.out.println("Los números ingresados son:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        sc.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }


}
