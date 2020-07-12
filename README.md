# Esercizi di Java

## int ritornaIntero()
E' un metodo statico che ritorna un intero. Dato 
che è statico esso è richiamabile nel metodo main(),
poiché sono solo i metodi statici che si possono
richiamare vicendevolmente ed esistono aldilà 
dell'esistenza di un'istanza di un oggetto che
le contiene.
***
## Interfaccia Funzionale - Funzione
E' sufficiente definire un'interfaccia con l'annotazione
@FunctionalInterface per ottenere la capacità di utilizzare
le espressioni lamba per implementare con una sintassi 
più compatta l'effettiva classe. E' senza bisogno di 
riscrivere classi in continuazione. L'alternativa come
sintassi è l'utilizzo di una classe anonima.
***
## Flussi
Un flusso è uno sequenza di dati che è possibile 
pensare come valori che si aggiungono via via nel 
tempo. Potrebbe non essere disponibile l'intera 
sequenza di valori, potenzialmente illimitati(codata). 
Functions that operate on a stream, producing another 
stream, are known as filters, and can be connected in pipelines,
analogously to function composition. Filters may operate on one
item of a stream at a time, or may base an item of output
on multiple items of input, such as a moving average. 

L'esercizio non è dei più semplici, si è voluto 
ricreare(in maniera personale) quello che è l'oggetto
Stream in Java. Per fare questo ho definito un'interfaccia.
```
public interface Flusso<S> {  
     <T> FlussoImpl<T> mappa(Funzione<T,S> funzione);
 }
```
Quest'interfaccia può essere superflua ma specifica 
che il Flusso è un contenitore di oggetti e definisce 
un metodo mappa che prende in input un oggetto Funzione
che opera su S e restituisce un generico T. 
Il Flusso potrebbe benissimo definire altri metodi e 
in pratica è così. Segue l'implementazione.
```
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
```
