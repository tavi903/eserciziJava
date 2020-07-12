package interfaccia;

import implementazione.FlussoImpl;

public interface Flusso<S> {
    <T> FlussoImpl<T> mappa(Funzione<T,S> funzione);
}