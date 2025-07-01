public class ExMatrizes01{

    public static void main (String[] args){
        int[][] matriz = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("" );
        }

        // Somar linha
        for(int i = 0; i < 5; i++){
            int somaLinha = 0;
            for(int j = 0; j < 5; j++){
                somaLinha += matriz [i][j];
            }
            System.out.printf("Soma da linha %d: %d\n", i, somaLinha);
        }

        
        // Somar colunas
        for(int j = 0; j < 5; j++){
            int somaColuna = 0;
            for(int i = 0; i < 5; i++){
                somaColuna += matriz [i][j];
            }
            System.out.printf("Soma da coluna %d: %d\n", j, somaColuna);
        }


    }

}