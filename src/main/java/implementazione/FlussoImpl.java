package implementazione;

import interfaccia.Flusso;
import interfaccia.Funzione;

import java.util.ArrayList;
import java.util.List;

public class FlussoImpl<S> implements Flusso<S> {
    private List<S> lista;

    @Override
    public <T> FlussoImpl<T> mappa(Funzione<T,S> funzione) {
        FlussoImpl<T> output = new FlussoImpl<>();
        List<T> temp = new ArrayList<>();
        lista.forEach(elem -> temp.add(funzione.applica(elem)));
        output.setLista(temp);
        return output;
    }

    public List<S> getLista() {
        return lista;
    }

    public void setLista(List<S> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}
