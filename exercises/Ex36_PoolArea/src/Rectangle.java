public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width >= 0 ? width : 0;
        this.length = length >= 0 ? length : 0;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
