public class Tesis extends MaterialBibliografico{
    String nombreDeInstitucion;

    public Tesis(String autor, String añoPublicacion, String nombre, String tipo, String nombreDeInstitucion) {
        super(autor, añoPublicacion, nombre, tipo);
        this.nombreDeInstitucion = nombreDeInstitucion;
    }

    public String getNombreDeInstitucion() {
        return nombreDeInstitucion;
    }

    public void setNombreDeInstitucion(String nombreDeInstitucion) {
        this.nombreDeInstitucion = nombreDeInstitucion;
    }

}
