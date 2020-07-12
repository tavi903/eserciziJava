package utils;

import interfaccia.Clonabile;

import java.util.ArrayList;
import java.util.List;

public class OrdinamentoUtils {
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

    // ---- INSERT SORT ----
    public static <T extends Clonabile<T> & Comparable> List<T> insertSort(List<T> lista) {
        List<T> copia = new ArrayList<>();
        List<T> ordinata = new ArrayList<>();
        lista.forEach(studente -> copia.add(studente.clona()));
        int min;
        for(int i = 0; i<lista.size(); i++) {
             min = trovaMinimo(copia);
             ordinata.add(copia.get(min));
             copia.remove(min);
        }
        return ordinata;
    }
}