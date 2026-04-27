package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {

        Person p1 = new Person("John", "Doe", 20);
        p1.address = "Warsaw";
        p1.yearOfBirth = 2005;

        p1.printData();

        // Task requirement
        p1.growOld(10);   // +10 age
        p1.printData();

        p1.beYounger();   // -1 age
        p1.printData();
    }
}
