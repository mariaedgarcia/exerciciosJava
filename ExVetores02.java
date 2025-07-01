import java.util.Scanner;

public class ExVetores02 {

    public static void main(String[] args) {
        int[] valores = new int[10];
        Scanner scanner = new Scanner(System.in);
        int numeroPar = 0;
        int numeroImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            valores[i] = scanner.nextInt();

            if (valores[i] % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("\nQuantidade de numeros pares digitados: " + numeroPar);
        System.out.println("Quantidade de numeros impares digitados: " + numeroImpar);
    }
}