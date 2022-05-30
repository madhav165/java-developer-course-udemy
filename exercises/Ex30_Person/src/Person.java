public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public void setAge(int age) {
        this.age = ((age >=0 ) && (age <= 100)) ? age : 0;
    }

    public boolean isTeen() {
        return ((age >= 13) && (age <= 19));
    }

    public String getFullName() {
        if ((this.firstName != null) && (!this.firstName.isEmpty())) {
            if ((this.lastName != null) && (!this.lastName.isEmpty())) {
                return this.firstName + " " + this.lastName;
            } else {
                return this.firstName;
            }
        } else {
            if ((this.lastName != null) && (!this.lastName.isEmpty())) {
                return this.lastName;
            } else {
                return "";
            }
        }
    }
}
