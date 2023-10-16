public class ArchivoPDF extends MaterialBibliografico{
    String url;

    public ArchivoPDF(String autor, String añoPublicacion, String nombre, String tipo, String url) {
        super(autor, añoPublicacion, nombre, tipo);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    }
