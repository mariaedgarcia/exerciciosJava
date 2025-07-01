import java.util.Scanner;

public class ExVetores04 {

    public static void main(String[] args) {
        double[] valores = new double[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            valores[i] = scanner.nextDouble();
        }

        System.out.println("Os valores digitados na ordem invertida: ");
        System.out.println("---------------------------");

        for (int i = 5; i >= 0; i--) {
            System.out.println("Valor " + (i + 1) + "°: " + valores[i]);
        }
    }
}
