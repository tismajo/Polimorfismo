public class Periodico extends MaterialBibliografico{
    String nombreDelPeriodico;

    public Periodico(String autor, String añoPublicacion, String nombre, String tipo, String nombreDelPeriodico) {
        super(autor, añoPublicacion, nombre, tipo);
        this.nombreDelPeriodico = nombreDelPeriodico;
    }

    public String getNombreDelPeriodico() {
        return nombreDelPeriodico;
    }

    public void setNombreDelPeriodico(String nombreDelPeriodico) {
        this.nombreDelPeriodico = nombreDelPeriodico;
    }


}
