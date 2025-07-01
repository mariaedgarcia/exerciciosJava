import java.util.Scanner;

public class ExVetores01 {

    public static void main (String [] args){
        int[] valores = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            System.out.println("Digite o "+(i + 1)+ "° valor: ");
            valores[i] = scanner.nextInt();            
        }
        System.out.println("Resultado dos valores digitados: ");
        System.out.println("---------------------------------");

        for (int i = 0; i < 6; i++){
            System.out.println("Valor "+ (i + 1) + "°: " + valores[i]);
        }
        
    }
}