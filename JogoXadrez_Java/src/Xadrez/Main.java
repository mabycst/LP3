package Xadrez;

public class Main {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();

        Peca rei = new Rei(0, 4);
        Peca rainha = new Rainha(1, 3);
        Peca bispo = new Bispo(2, 2);
        Peca cavalo = new Cavalo(3, 1);
        Peca torre = new Torre(4, 0);
        Peca peao = new Peao(6, 0);

        tabuleiro.adicionarPeca(rei, 0, 4);
        tabuleiro.adicionarPeca(rainha, 1, 3);
        tabuleiro.adicionarPeca(bispo, 2, 2);
        tabuleiro.adicionarPeca(cavalo, 3, 1);
        tabuleiro.adicionarPeca(torre, 4, 0);
        tabuleiro.adicionarPeca(peao, 6, 0);

        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo o Rei para (1, 4): " + tabuleiro.moverPeca(0, 4, 1, 4)); 
        System.out.println("Movendo a Rainha para (4, 4): " + tabuleiro.moverPeca(1, 3, 4, 4)); 
        System.out.println("Movendo o Peão para (6, 2): " + tabuleiro.moverPeca(6, 0, 6, 2)); 
        System.out.println("Movendo o Cavalo para (5, 3): " + tabuleiro.moverPeca(3, 1, 5, 3));
        System.out.println("Movendo a Torre para (4, 2): " + tabuleiro.moverPeca(4, 0, 4, 2)); 

        tabuleiro.imprimirTabuleiro();
    }
}
