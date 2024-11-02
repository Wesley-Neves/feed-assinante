import java.util.Date;

public class Noticia {

    private String titulo;
    private String conteudo;
    private Date date;

    public Noticia() {

    }

    public Noticia(String titulo, String conteudo, Date date) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
