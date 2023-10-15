public class PaginaWeb {
    String nombreDelSitioWeb, url;

    public PaginaWeb(String nombreDelSitioWeb, String url) {
        this.nombreDelSitioWeb = nombreDelSitioWeb;
        this.url = url;
    }

    public String getNombreDelSitioWeb() {
        return nombreDelSitioWeb;
    }

    public void setNombreDelSitioWeb(String nombreDelSitioWeb) {
        this.nombreDelSitioWeb = nombreDelSitioWeb;
    }
}
