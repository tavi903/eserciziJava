import implementazione.FlussoImpl;
import interfaccia.Funzione;
import utils.FattorialeUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestAll {
    @Test
    public void testRitornaIntero() {
        assert (Application.ritornaIntero() == 1): "ritornaIntero() non ritorna 1!";
    }

    @Test
    public void testFlusso() {
        FlussoImpl<String> esempio = new FlussoImpl<>();
        esempio.setLista(Arrays.asList("abababa   ", "piero", "  romeo", " topo  "));
        Funzione<String, String> func = s -> s.toUpperCase();
        List<String> temp = esempio.mappa(func)
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
}