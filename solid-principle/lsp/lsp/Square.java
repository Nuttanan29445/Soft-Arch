public class Square implements GeometricShape {
    private int side;

    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int getArea() {
        return side * side;
    }
}
