public interface IAssunto {
    void notificar(Noticia noticia);

    void addObservador(IObservador observador);

    void removerObservador(IObservador observador);
}
