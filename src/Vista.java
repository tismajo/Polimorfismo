import java.util.Scanner;

public class Vista {
    Controlador c = new Controlador();
    Scanner scn = new Scanner(System.in);

    public void mostrarMenu() {
        c.creacionVerificacionCSV();
        while (true) {
            System.out.println("\nM E N Ú");
            System.out.println("Ingresa el número de opción (solo el número, sin el punto): ");
            System.out.println("1. Ingresar material bibliográfico\n2. Generar referencia\n3. Conteo del material\n0. Salir");
            int opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                scn = new Scanner(System.in);
                System.out.print("Ingresa el autor: ");
                String autor = scn.nextLine();
                System.out.print("Ingresa el año de publicación: ");
                String añoPublicacion = scn.nextLine();
                System.out.print("Ingresa el nombre del material: ");
                String nombreMaterial = scn.nextLine();
                System.out.print("Ingresa el tipo de material (por el momento solo aceptamos libro, archivo pdf, pagina web, tesis y periódico): ");
                String tipo = scn.nextLine();
                if (tipo.equalsIgnoreCase("Libro")){
                    System.out.print("Ingresa el nombre de la editorial: ");
                    String editorial = scn.nextLine();
                    System.out.print("Ingresa el genero del libro: ");
                    String genero = scn.nextLine();
                    c.ingresarMaterialLibro(autor, añoPublicacion, nombreMaterial, tipo, editorial, genero);
                } else if (tipo.equalsIgnoreCase("Archivo PDF")){
                    System.out.print("Ingresa el URL: ");
                    String url = scn.nextLine();
                    c.ingresarMaterialPDF(autor, añoPublicacion, nombreMaterial, tipo, url);
                }
                    break;
                case 2:
                    
                    c.mostrarCitaLibro(autor, añoPublicacion, nombreMaterial, tipo, editorial, genero);
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
