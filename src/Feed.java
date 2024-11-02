import java.util.ArrayList;
import java.util.List;

public class Feed implements IAssunto{

    private List<Noticia> noticias = new ArrayList<>();
    private List<IObservador> observadores = new ArrayList<>();

    @Override
    public void notificar(Noticia noticia) {
        for (IObservador observador : observadores){
            observador.atualizar(noticia);
        }
    }

    @Override
    public void addObservador(IObservador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(IObservador observador) {
        observadores.remove(observador);
    }

    public void adicionarNoticia(Noticia noticia){
        noticias.add(noticia);
        notificar(noticia);
    }
}
