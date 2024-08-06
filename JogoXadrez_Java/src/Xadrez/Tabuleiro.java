package Xadrez;

public class Tabuleiro {

	private Peca[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Peca[8][8];
    }

    public void adicionarPeca(Peca peca, int x, int y) {
        if (estaPosicaoValida(x, y)) {
            tabuleiro[x][y] = peca;
        }
    }

    public boolean moverPeca(int x, int y, int novoX, int novoY) {
        if (!estaPosicaoValida(novoX, novoY)) {
            return false;
        }

        Peca peca = tabuleiro[x][y];
        if (peca != null && peca.mover(novoX, novoY)) {
            if (tabuleiro[novoX][novoY] != null && tabuleiro[novoX][novoY].getClass() == peca.getClass()) {
                return false;
            }
            tabuleiro[novoX][novoY] = peca;
            tabuleiro[x][y] = null;
            return true;
        }
        return false;
    }

    private boolean estaPosicaoValida(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] != null) {
                    System.out.print(tabuleiro[i][j].getClass().getSimpleName().charAt(0) + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}