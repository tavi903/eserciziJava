package utils;

import interfaccia.Clonabile;

import java.util.ArrayList;
import java.util.List;

public class OrdinamentoUtils {
    /**
     * Funzione che ritorna, data una lista di elementi(che sono Comparable),
     * l'indice in cui si trova il minimo.
     */
    public static <T extends Comparable> int trovaMinimo(List<T> dati) {
        if (dati.size() == 0) return -1;
        else if (dati.size() == 1) {
          return 0;
        } else {
            int min = 0;
            for(int i = 0; i < dati.size(); i++) {
                if(dati.get(i).compareTo(dati.get(min)) < 0) min = i;
            }
            return min;
        }
    }

    /**
     * Data una lista di elementi, clonabili e comparabili, ritorna
     * una nuova lista di elementi ordinati. L'algortimo e' l'Insert Sort
     * che ha una complessita' n quadro, con n numero di elementi.
     */
    public static <T extends Clonabile<T> & Comparable> List<T> insertSort(List<T> lista) {
        List<T> copia = new ArrayList<>();
        List<T> ordinata = new ArrayList<>();
        lista.forEach(el -> copia.add(el.clona()));
        int min;
        for(int i = 0; i<lista.size(); i++) {
             min = trovaMinimo(copia);
             ordinata.add(copia.get(min));
             copia.remove(min);
        }
        return ordinata;
    }
}