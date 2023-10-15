public class MaterialBibliografico {
    String autor, añoPublicacion, nombre;

    public MaterialBibliografico(String autor, String añoPublicacion, String nombre) {
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.nombre = nombre;
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
}
