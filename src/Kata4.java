import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = scanner.nextInt();
        if (dia < 1 || dia > 7) {
            System.out.println("Error: día inválido");
            return;
        }

        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();
        if (hora < 0 || hora > 23) {
            System.out.println("Error: hora inválida");
            return;
        }

        switch (dia) {
            case 1, 2, 3, 4, 5:
                if (hora >= 6 && hora < 20) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada.");
                }
                System.out.println("Horario de lunes a viernes: 6:00 AM - 8:00 PM");
                break;
            case 6:
                if (hora >= 7 && hora < 14) {
                    System.out.println("La cafetería está abierta.");
                } else {
                    System.out.println("La cafetería está cerrada.");
                }
                System.out.println("Horario de sábado: 7:00 AM - 2:00 PM");
                break;
            case 7:
                System.out.println("La cafetería está cerrada.");
                System.out.println("Horario de domingo: cerrado todo el día");
                break;
        }
    }
}