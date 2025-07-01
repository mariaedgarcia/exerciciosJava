public class ExMatrizes05{

    public static void main (String[] args){

        int [][] = new int [3][3];

        // Preencher a matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }

        int somaReferencia = matriz [0][0] + matriz [0][1] + matriz [0][2];
        boolean verifica = false;

        // For para verificar a soma das linhas

        // For para verificar a soma das colunas

        // Verifica a diagonal principal

        // Verifica a diagonal secundaria

        // Mostra mensagem se é ou não um quadrado mágico
        if (verifica){
            System.out.println("É um quadrado mágico");
        } else {
            System.out.printlm("Não é um quadrado mágico");
        }
    }
}