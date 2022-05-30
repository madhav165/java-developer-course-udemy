public class Main {

    public static void main (String[] args) {

        Person p = new Person();
        System.out.println(p.getFullName());
        p.setFirstName("Harry");
        System.out.println(p.getFullName());
        p.setLastName("Potter");
        p.setAge(11);
        System.out.println(p.getFullName());
        System.out.println(p.getAge());

    }
}
