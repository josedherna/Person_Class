//Jose Hernandez
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Matthew","Spring","1111111",
                new myDate(8,31,2000), new myDate(6,21,2018));
        Faculty f1 = new Faculty("Carlos","Ramirez","2222222", new myDate(7,21,2018));
        System.out.println(s1.toString());
        System.out.println(f1.toString());
    }
}
