import implementazione.FlussoImpl;
import interfaccia.Funzione;
import model.Studente;
import utils.FattorialeUtils;
import org.junit.Test;
import utils.OrdinamentoUtils;

import java.util.*;

public class TestAll {
    @Test
    public void testRitornaIntero() {
        assert (Application.ritornaIntero() == 1): "ritornaIntero() non ritorna 1!";
    }

    @Test
    public void testFlusso() {
        FlussoImpl<String> esempio = new FlussoImpl<>();
        esempio.setLista(Arrays.asList("abababa   ", "piero", "  romeo", " topo  "));
        Funzione<String, String> toUpperCase = s -> s.toUpperCase();
        List<String> temp = esempio.mappa(toUpperCase)
                .mappa(s -> s.trim())
                .mappa(new Funzione<String, String>() {
                    @Override
                    public String applica(String s) {
                        return s.replace('A','y');
                    }
                }).getLista();
        List<String> confronto = Arrays.asList("yByByBy", "PIERO", "ROMEO", "TOPO");
        for (int i = 0; i < temp.size(); i++) {
            assert (temp.get(i).equals(confronto.get(i))): "La parola "+i+" non e' corretta";
        }
    }

    @Test
    public void testFattoriale() {
        int[] arrayValori = {11, 5, 7, 9, 2, 1, 15};
        for (int valore : arrayValori) {
            assert (FattorialeUtils.iterativo(valore) == FattorialeUtils.ricorsivo(valore));
        }
    }

    @Test
    public void testOrdinamentoStudente() {
        List<Studente> studenteList = new ArrayList<>();
        studenteList.add(new Studente(2, true, 100, 24d, "via", "civico", "paese", "provincia"));
        studenteList.add(new Studente(1, true, 100, 24d, "via", "civico", "paese", "provincia"));
        studenteList.add(new Studente(3, true, 100, 24d, "via", "civico", "paese", "provincia"));

        Collections.sort(studenteList);
        assert studenteList.get(0).getMatricola().equals(1) &&
                studenteList.get(1).getMatricola().equals(2) &&
                studenteList.get(2).getMatricola().equals(3) : "Non sono ordinati correttamente!";

        // ordinamento tramite lambda
        Collections.sort(studenteList, (d1, d2) -> {
            return d2.getMatricola() - d1.getMatricola();
        });
        assert studenteList.get(0).getMatricola().equals(3) &&
                studenteList.get(1).getMatricola().equals(2) &&
                studenteList.get(2).getMatricola().equals(1) : "Non sono ordinati correttamente!";

        // ordinamento tramite InsertSort
        Collections.sort(studenteList);
        List<Studente> ordinataInsertSort = OrdinamentoUtils.insertSort(studenteList);
        assert studenteList.get(0).equals(ordinataInsertSort.get(0)) &&
                studenteList.get(1).equals(ordinataInsertSort.get(1)) &&
                studenteList.get(2).equals(ordinataInsertSort.get(2)) : "Non sono ordinati correttamente!";
    }
}