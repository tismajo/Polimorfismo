public class MaterialBibliografico {
    String autor, añoPublicacion, nombre, tipo;

    public MaterialBibliografico(String autor, String añoPublicacion, String nombre, String tipo) {
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String generarCitaAPA(String autor, String fecha, String nombreMaterial){
        return (autor + ". (" + fecha + ")." + nombreMaterial);
    }

}
