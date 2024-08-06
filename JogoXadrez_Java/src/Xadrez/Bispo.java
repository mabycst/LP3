package Xadrez;

public class Bispo extends Peca {
    public Bispo(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (Math.abs(novoX - x) == Math.abs(novoY - y)) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
}
