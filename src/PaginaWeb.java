public class PaginaWeb extends MaterialBibliografico{
    String nombreDelSitioWeb, url;

    public PaginaWeb(String autor, String añoPublicacion, String nombre, String tipo, String nombreDelSitioWeb,
            String url) {
        super(autor, añoPublicacion, nombre, tipo);
        this.nombreDelSitioWeb = nombreDelSitioWeb;
        this.url = url;
    }

    public String getNombreDelSitioWeb() {
        return nombreDelSitioWeb;
    }

    public void setNombreDelSitioWeb(String nombreDelSitioWeb) {
        this.nombreDelSitioWeb = nombreDelSitioWeb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
