import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[][] r = new int[3][2];
        int[] v = new int[100];
        boolean isPrimo = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("inserisci un valore");
                m[i][j] = in.nextInt();
            }

        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("inserisci un valore");
                r[i][j] = in.nextInt();
            }

        }
        System.out.println(isDiagonale(m, isPrimo));
        System.out.println(Trasposta(m));
            System.out.println(sommaR(r,v));

    }

    //esercizio 3
    private static boolean isDiagonale(int[][] m, boolean isPrimo) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != m[j][i]) {
                    isPrimo = false;
                    break;
                }
            }
        }
        return isPrimo;
    }

    //esercizio 4
    private static int[][] Trasposta(int[][] m) {
        int[][] mat = m;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                mat[j][i] = m[i][j];


            }
        }
        return mat;
    }

    //esercizio 5
    private static int[] sommaR(int[][] r, int[] v) {
        int sommaTemp = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[0].length; j++) {
                sommaTemp += r[i][j];
                v[0] = sommaTemp;
                v[0]++;


            }
        }
        return v;
    }
}
