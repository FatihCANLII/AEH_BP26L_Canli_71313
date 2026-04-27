package pl.pp;

public class Person {

    String firstName;
    String lastName;
    int age;

    // new fields (Task requirement)
    String address;
    int yearOfBirth;

    // constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // increase age by given value
    public void growOld(int years) {
        age += years;
    }

    // decrease age by 1
    public void beYounger() {
        age--;
    }

    // display data
    public void printData() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("----------------------");
    }
}