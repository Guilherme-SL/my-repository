import java.util.Scanner;

public class exemplovetores{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[5];

        //laço para ler as notas
        for (int i = 0; i < 5; i++) {
            System.out.print("Imforme uma nota " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
        }

        //exibindo as notas armazenadas
        System.out.println("Notas armazenadas");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        scan.close();
    }
}