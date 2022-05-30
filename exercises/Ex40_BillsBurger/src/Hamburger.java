public class Hamburger {

    private String name, meat, breadRollType, addition1Name, addition2Name, addition3Name, addition4Name;
    private double price, addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String name, double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition2(String name, double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition3(String name, double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public void addHamburgerAddition4(String name, double price) {
        this.price += price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public double itemizeHamburger() {
        return this.price;
    }
}
