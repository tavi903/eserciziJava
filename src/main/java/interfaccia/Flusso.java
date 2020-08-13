package interfaccia;

public interface Flusso<S> {
    <T> Flusso<T> mappa(Funzione<T, S> funzione);
}