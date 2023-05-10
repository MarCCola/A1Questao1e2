import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        // Declarações de variaveis e array.

        int j = 0;
        String[] nomes = new String[20];
        float[] tempo = new float[20];
        Scanner in = new Scanner(System.in);

        // Atribuindo valores aos vetores.

        for (int i = 0; i < nomes.length; i++) { // Atribuindo ao primeiro vetor.

            System.out.println("Informe nome e tempo :" + i);
            nomes[i] = in.next();
            tempo[i] = in.nextFloat();
        }
        Vencedor(nomes, tempo);
        Ultimo(nomes, tempo);
        TempoMedio(tempo);
    }

    // metodos

    public static void Vencedor(String N[], float T[]) { // Descobrir quem e o vencedor.
        float win = 1;

        String winner = " ";
        for (int i = 0; i < N.length; i++) {

            if (T[i] < win) {

                win = T[i];
                winner = N[i];

            }

        }
        System.out.println(" O vencedor e: " + winner + " " + win);

    }

    public static void Ultimo(String N[], float T[]) { // Descobrir quem e o ultimo.
        float lose = 1;

        String loser = " ";
        for (int i = 0; i < N.length; i++) {

            if (T[i] > lose) {

                lose = T[i];
                loser = N[i];

            }

        }
        System.out.println(" O ultimo e: " + loser + " " + lose);
    }

    public static void TempoMedio(float T[]) { // Descobrir o tempo medio da corrida.

        float X = 0;
        float Z;

        for (int i = 0; i < 20; i++) {
            X = (X + T[i]);
        }
        Z = X / 20;
        System.out.println("Tempo medio da corrida:" + Z);
    }
}