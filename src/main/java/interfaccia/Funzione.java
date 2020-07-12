package interfaccia;

@FunctionalInterface
public interface Funzione<T, S> {
     T applica(S s);
}
