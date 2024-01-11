public class Testador {

    public static void main(String[] args) {

        int[] vetorInteiros = {1, 12, 3, 5, 2, 7, 12, 30, 32, 45};
        System.out.println("Elementos do vetor");
        ListaDeInteiros.imprimirVetor(vetorInteiros);
        System.out.println("Soma do vetor");
        ListaDeInteiros.imprimirSomaElementosVetor(vetorInteiros);
        System.out.println("Media do vetor");
        ListaDeInteiros.imprimirMediaElementosVetor(vetorInteiros);
        System.out.println("Éh par ou impar");
        ListaDeInteiros.imprimirSeElementoEhParOuImpar(vetorInteiros);
        System.out.println("Imprime primeiro par");
        ListaDeInteiros.imprimirPrimeiroPar(vetorInteiros);
        System.out.println("Imprime primeiro impar");
        ListaDeInteiros.imprimirPrimeiroImpar(vetorInteiros);
    }

}
