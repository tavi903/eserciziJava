package utils;

/**
 * <b>Algortimo iterativo</b>
 * <br>
 * Operazione piu' significativa/rilevante e' la moltiplicazione, avviene n volte per un input
 * pari a n. La complessita' e' lineare.
 * <br>
 * <b>Algoritmo ricorsivo</b>
 * <br>
 * La complessita' e' sempre lineare tuttavia, a causa all'aggiunta successiva
 * di continui elementi allo stack, il metodo risulta piu' lento del precedente.
 * E ha un limite oltre il quale lo stack si satura.
 */
public class FattorialeUtils {
    public static int ricorsivo(int n) {
        if (n == 0) return 1;
        if (n == 1 || n == 2) return n;
        else {
            return n * ricorsivo(n - 1);
        }
    }

    public static int iterativo(int n) {
        int output = 1;
        for (int i = 1; i <= n; i++) {
            output *= i;
        }
        return output;
    }
}
