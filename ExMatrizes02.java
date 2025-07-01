public class ExMatrizes02 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][5];
        int pares = 0;
        int impares = 0;
        boolean existeRepetido = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }

       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                int valor = matriz[i][j];
                System.out.print(valor + "\t");
                if (valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (i == x && j == y)
                            continue;

                        if (matriz[i][j] == matriz[x][y]) {
                            existeRepetido = true;
                        }
                    }
                }
            }
        }

        System.out.println("\nA) Possui elementos repetidos? " + (existeRepetido ? "Sim" : "Não"));
        System.out.println("B) Quantidade de números pares: " + pares);
        System.out.println("C) Quantidade de números ímpares: " + impares);
    }
}
