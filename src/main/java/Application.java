import org.joda.time.DateTime;
import utils.FattorialeUtils;

import java.text.SimpleDateFormat;

public class Application {
    public static void main(String args[]) {

        // System.out.println(func.applica(a));

        // ---- misuro performance Fattoriale(ricorsivo) ----
        long reference = System.nanoTime();
        FattorialeUtils.ricorsivo(2000);
        long finishm = System.nanoTime();
        // System.out.println(((double) (finishm - reference)) / 1000000000.0);  //in seconds

        // ---- misuro performance Fattoriale(iterativo) ----
        reference = System.nanoTime();
        FattorialeUtils.iterativo(2000);
        finishm = System.nanoTime();
        // System.out.println(((double) (finishm - reference)) / 1000000000.0);  //in seconds

        DateTime data = DateTime.now();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        // System.out.println(sdf.format(data.toDate()));

        /*
        List<Studente> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Studente(12345678, true));
        listaStudenti.add(new Studente(0, true));
        listaStudenti.add(new Studente(34567, false));

        Studente studente = listaStudenti.get(1);
        System.out.println(studente == listaStudenti.get(1));
        Studente studente1 = listaStudenti.get(1).clona();
        System.out.println(studente1 == listaStudenti.get(1));
        studente1.setMatricola(-1);
        System.out.println(listaStudenti.get(1).getMatricola());

        Integer uno = 1;
        Integer due = uno;
        System.out.println(uno == due);
        uno = 2;
        System.out.println(uno + " " + due);

        System.out.println(OrdinamentoUtils.trovaMinimo(listaStudenti));
        System.out.println(OrdinamentoUtils.insertSort(listaStudenti));
         */

    }

    public static int ritornaIntero() {
        return 1;
    }

}
