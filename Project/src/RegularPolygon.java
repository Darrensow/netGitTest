public class RegularPolygon {
    private int n;
    private double sideLength, x, y;

    public RegularPolygon(int n, double sideLength) {
        this.n = n;
        this.sideLength = sideLength;
    }

    public RegularPolygon(int n, double sideLength, double x, double y) {
        this.n = n;
        this.sideLength = sideLength;
        this.x = x;
        this.y = y;
    }

    public RegularPolygon() {
        this.n = 3;
        this.sideLength = 1;
        x = y = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
