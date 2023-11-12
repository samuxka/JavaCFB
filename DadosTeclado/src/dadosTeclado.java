import java.util.Scanner;

public class dadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*int n1 = 0;
        int n2 = 0;
        int res = 0;

        System.out.println("numero: ");
        n1 = scan.nextInt();
        System.out.println("numero: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("%d + %d = %d", n1, n2, res);*/

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
        final int media = 6;
        String nome = "", res = "";

        System.out.print("Nome do aluno: ");
        nome = scan.nextLine();
        System.out.print("Primeiro Bimestre: ");
        n1 = scan.nextInt();
        System.out.print("Segundo Bimestre: ");
        n2 = scan.nextInt();
        System.out.print("Terceiro Bimestre: ");
        n3 = scan.nextInt();
        System.out.print("Quarto Bimestre: ");
        n4 = scan.nextInt();
        soma = n1 + n2 + n3 + n4;
        if (soma >= media) {
            res = "Aprovado";
        } else if (soma >= 4) {
            res = "Recuperação";
        } else {
            res = "Reprovado";
        }
        System.out.printf("\nAluno: %s\nMedia Final: %.1f\nResultado: %s", nome
        , ((double) soma / 4), res);
    }
}
