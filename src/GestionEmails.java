import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GestionEmails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> emails = new HashSet<>();

        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Registrar nuevo email");
            System.out.println("2. Mostrar emails registrados");
            System.out.println("3. Comprobar si un email está registrado");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Introduce el email: ");
                String email = sc.nextLine();

                if (emails.contains(email)) {
                    System.out.println("Email ya registrado.");
                } else {
                    emails.add(email);
                    System.out.println("Email registrado correctamente.");
                }

            } else if (opcion == 2) {
                System.out.println("--- EMAILS REGISTRADOS ---");
                if (emails.isEmpty()) {
                    System.out.println("No hay emails registrados.");
                } else {
                    for (String email : emails) {
                        System.out.println(email);
                    }
                }

            } else if (opcion == 3) {
                System.out.print("Introduce el email a comprobar: ");
                String email = sc.nextLine();

                if (emails.contains(email)) {
                    System.out.println("El email está registrado.");
                } else {
                    System.out.println("El email NO está registrado.");
                }
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}
