import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la bebida: ");
        String nombreBebida = scanner.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = scanner.nextDouble();

        String clasificacion;
        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura >= 30) {
            clasificacion = "Templada";
        } else {
            clasificacion = "Fría";
        }

        System.out.println(nombreBebida + ": " + clasificacion);
    }
}