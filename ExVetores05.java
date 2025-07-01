public class ExVetores05 {

    public static void main (String[] args){
        
        int[] vetor = new int[15];
        double media = 0;
        double soma = 0;

        for(int i = 0; i < 15; i++){
            vetor[i] = (int)(Math.random() * 11);
            soma += vetor[i];
        }
        media = soma / 15;
        System.out.println("Média: "+media);
        for(int i = 0; i < 15; i++){
            System.out.println(vetor[i]);
        }
    }
}