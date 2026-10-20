import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta: ");
        int totalCuenta = scanner.nextInt();

        if (totalCuenta <= 0) {
            System.out.println("Error: total inválido");
            return;
        }

        System.out.print("Ingresa el porcentaje de propina: ");
        int porcentajePropina = scanner.nextInt();

        if (porcentajePropina < 0 || porcentajePropina > 100) {
            System.out.println("Error: porcentaje inválido");
            return;
        }

        int propina = totalCuenta * porcentajePropina / 100;
        int totalPagar = totalCuenta + propina;

        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" + totalPagar);

        if (porcentajePropina > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentajePropina < 5) {
            System.out.println("Propina muy baja");
        }
    }
}