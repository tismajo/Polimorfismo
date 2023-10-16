public class Libro extends MaterialBibliografico{
    String editorial, genero;

    public Libro(String autor, String añoPublicacion, String nombre, String tipo, String editorial, String genero) {
        super(autor, añoPublicacion, nombre, tipo);
        this.editorial = editorial;
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

@Override
    public String generarCitaAPA(String autor, String año, String nombreMaterial){
        String apalibro = super.generarCitaAPA(autor, año, nombreMaterial) + editorial;
        return apalibro;
    }

}
