public class ListaDeInteiros {


    public static void imprimirVetor(int[] vetor) {

        for(int indice = 0; indice < vetor.length; indice++) {
            System.out.println(vetor[indice]);
        }

    }

    public static void imprimirSomaElementosVetor(int[] vetor) {
        System.out.println(calcularSoma(vetor));
    }

    public static void imprimirMediaElementosVetor(int[] vetor){
        System.out.println(calcularSoma(vetor) / vetor.length);
    }

    public static void imprimirSeElementoEhParOuImpar(int[] vetor){
        for(int indice = 0; indice < vetor.length; indice++){
            int modulo = vetor[indice]%2;
            if (modulo == 0) {
                System.out.println("Éh par");
            } else {
                System.out.println("Éh impar");
            }
        }
    }

    public static void imprimirPrimeiroPar(int[] vetor){
        String resultado = "";
        int indice = 0;
        while(resultado.equals("")){
            if (vetor[indice]%2 == 0) {
                resultado = "Éh par";
                System.out.println(vetor[indice]);
            }
            indice++;
        }
    }

    public static void imprimirPrimeiroImpar(int[] vetor){
        String resultado = "";
        int indice = 0;
        do {
            if (vetor[indice]%2 == 1) {
                resultado = "Éh impar";
                System.out.println(vetor[indice]);
            }
            indice++;
        } while (resultado.equals(""));
    }

    private static int calcularSoma(int[] vetor) {
        int soma = 0;
        for(int indice = 0; indice < vetor.length; indice++) {
            soma = soma + vetor[indice];
        }
        return soma;
    }

}
