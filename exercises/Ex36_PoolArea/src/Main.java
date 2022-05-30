public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 10);
        System.out.println("rectangle.width = " + r.getWidth());
        System.out.println("rectangle.length = " + r.getLength());
        System.out.println("rectangle.area = " + r.getArea());

        Cuboid c = new Cuboid(5,10, 5);
        System.out.println("cuboid.width = " + c.getWidth());
        System.out.println("cuboid.length = " + c.getLength());
        System.out.println("cuboid.height = " + c.getHeight());
        System.out.println("cuboid.area = " + c.getArea());
        System.out.println("cuboid.volume = " + c.getVolume());
    }
}
