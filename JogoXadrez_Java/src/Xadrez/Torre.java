package Xadrez;

public class Torre extends Peca {
    public Torre(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        if (novoX == x || novoY == y) {
            x = novoX;
            y = novoY;
            return true;
        }
        return false;
    }
}