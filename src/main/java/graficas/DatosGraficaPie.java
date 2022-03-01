package graficas;

public class DatosGraficaPie {
    private String titulo;
    private String tipo;
    private String[] etiquetas;
    private int []valores;

    public String getTipo() {
        return tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int[] getValores() {
        return valores;
    }

    public String[] getEtiquetas() {
        return etiquetas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEtiquetas(String[] etiquetas) {
        this.etiquetas = etiquetas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }
}
