import java.util.Scanner;

public class ExVetores03 {

    public static void main (String[] args){
        double[] valores = new double[10];
        Scanner scanner = new Scanner(System.in);
        double numeroMaior = 0;
        double numeroMenor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            valores[i] = scanner.nextDouble();

            if (valores[i] > numeroMaior){
                numeroMaior = valores[i];
            }
            if (valores[i] < numeroMenor){
                numeroMenor = valores[i];
            }
    }
    System.out.println("O maior numero digitado foi: "+ numeroMaior);
    System.out.println("O menor numero digitado foi: "+ numeroMenor);
  }
}