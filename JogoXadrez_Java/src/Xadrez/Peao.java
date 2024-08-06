package Xadrez;

public class Peao extends Peca {
    private boolean primeiroMovimento = true;

    public Peao(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (x == novoX) {
            if (primeiroMovimento && (novoY == y + 2 || novoY == y + 1)) {
                primeiroMovimento = false;
                y = novoY;
                return true;
            } else if (novoY == y + 1) {
                y = novoY;
                return true;
            }
        } else if (Math.abs(novoX - x) == 1 && novoY == y + 1) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
}