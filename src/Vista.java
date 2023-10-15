import java.util.Scanner;

public class Vista {
    Controlador c = new Controlador();
    public void mostrarMenu() {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("\nM E N Ú");
            System.out.println("Ingresa el número de opción: ");
            System.out.println("1. Ingresar datos\n2. Consultar un recinto\n3. Consultar un evento\n4. Eventos sin recinto\n5. Asignar un evento a un recinto");
            int opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, inténtelo de nuevo.");
                    break;
            }
        }
    }
}
