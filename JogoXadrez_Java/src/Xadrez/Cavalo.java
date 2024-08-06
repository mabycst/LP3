package Xadrez;

public class Cavalo extends Peca {
    public Cavalo(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        int dx = Math.abs(novoX - x);
        int dy = Math.abs(novoY - y);
        if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
}
