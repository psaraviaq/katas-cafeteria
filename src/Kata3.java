import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subtotal = 0;
        int precio;

        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = scanner.nextInt();
            subtotal += precio;
        } while (precio != 0);

        int iva = (int) (subtotal * 0.19);
        int totalConIVA = subtotal + iva;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);

        if (totalConIVA > 50000) {
            int descuento = (int) (totalConIVA * 0.10);
            System.out.println("Total con IVA: $" + totalConIVA);
            System.out.println("Descuento (10%): $" + descuento);
            System.out.println("Total a pagar: $" + (totalConIVA - descuento));
        } else {
            System.out.println("Total: $" + totalConIVA);
        }
    }
}