import java.text.SimpleDateFormat;

public class Assinante implements IObservador{

    private String nome;
    private String email;

    public Assinante() {

    }

    public Assinante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void atualizar(Noticia noticia){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Assinante: "+nome + "\nEmail: "+email);
        System.out.println("\nNova noticia: " +noticia.getTitulo());
        System.out.println("Conteudo: "+noticia.getConteudo());
        System.out.println("Data: "+ formatoData.format(noticia.getDate()));
        System.out.println("******************");
    }
}
