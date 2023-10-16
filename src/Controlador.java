import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Controlador {
    public void creacionVerificacionCSV(){
        File materialBibliografico = new File("materialBibliografico.csv");

        if (!materialBibliografico.exists()){
            try {
                materialBibliografico.createNewFile();
                System.out.println("Todo listo para empezar...");
            } catch (IOException e) {
                System.out.println("Error encontrado" + e.getMessage());
        }
        }
    }

    public void ingresarMaterialLibro(String autor, String añoPublicacion, String nombreMaterial, String tipo, String editorial, String genero){
        String archivo = "materialBibliografico.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))){
            writer.write(autor + "," + añoPublicacion + "," + nombreMaterial + "," + tipo + "," + editorial + "," + genero);
            writer.newLine();
            System.out.println(nombreMaterial + " agregado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

    public void ingresarMaterialPDF(String autor, String añoPublicacion, String nombreMaterial, String tipo, String url){
        String archivo = "materialBibliografico.csv";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))){
            writer.write(autor + "," + añoPublicacion + "," + nombreMaterial + "," + tipo + "," + url);
            writer.newLine();
            System.out.println(nombreMaterial + " agregado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

    public void buscarMaterial(String autor, String nombre){
        String archivo = "materialBibliografico.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(",");
                if (columnas.length >= 2 && columnas[0].equals(autor) && columnas[2].equals(nombre)) {
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarCitaLibro(String autor, String añoPublicacion, String nombre, String tipo, String editorial, String genero){
        buscarMaterial(autor, nombre);
        System.out.print();
        }

    public void mostrarConteo(String conteoPor){
    }

    public void mostrarCatalogo(){

    }
}
