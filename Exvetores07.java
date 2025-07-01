import java.util.Scanner;

public class ExVetores07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];
        int somaPares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite 6 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("\nNúmeros pares digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                somaPares += vetor[i];
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);

        System.out.print("Números ímpares digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.print(vetor[i] + " ");
                quantidadeImpares++;
            }
        }

        System.out.println("\nQuantidade de números ímpares: " + quantidadeImpares);

        scanner.close();
    }
}
