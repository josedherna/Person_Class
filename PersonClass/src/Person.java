public class Person {
    protected String firstName;
    protected String lastName;
    protected myDate date;
    Person(){
        this.firstName="";
        this.lastName ="";
        this.date = new myDate(1,1,1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + date.toString() +
                '}';
    }
}
