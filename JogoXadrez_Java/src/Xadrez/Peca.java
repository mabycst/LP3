package Xadrez;

abstract class Peca {
	protected int x, y;

    public Peca(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean mover(int novoX, int novoY);
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
