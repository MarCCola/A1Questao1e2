import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        // Declarações de variaveis e array.

        int j = 0;
        int[][] ListaDeAlunos = new int[20][1];
        Scanner in = new Scanner(System.in);

        // Atribuindo valores ao vetor bidimencional.

        for (int i = 0; i < ListaDeAlunos.length; i++) { // Atribuindo ao primeiro vetor.

            System.out.println("Informe a média :" + i + " " + j);
            ListaDeAlunos[i][0] = in.nextInt();

            for (j = 0; j < ListaDeAlunos[0].length; j++) { // Atribuindo ao segundo vetor.

                System.out.println("Informe as faltas :" + i + " " + j);
                ListaDeAlunos[0][j] = in.nextInt();

            }
        }

        // Imprimindo as quantidades de aprovados usando o metodo criado na classe.

        System.out.println("Aprovados: " + Aprovados(ListaDeAlunos));

        in.close();
    }

    // Metodo para contagem de aprovados, reprovados e alunos para fazerem prova
    // final.
    public static int Aprovados(int arr[][]) {
        int soma = 0;
        int ProvFinal = 0;
        int reprovado = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][0] >= 70 && arr[0][j] <= 15) {
                    soma++;
                } else if (arr[i][0] >= 40 && arr[0][j] < 15) {

                    ProvFinal++;

                } else

                    reprovado++;
            }
        }
        return soma; // Retornando o valor solicitado pelo problema.

    }
}