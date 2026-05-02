package pl.pp;

public class Person {

    private String forename;
    private String surname;
    private int age;

    // Empty constructor
    public Person() {
    }

    // Constructor with parameters
    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". I am " + age + " years old.");
    }

    public int growOld() {
        age = age + 1;
        return age;
    }

    // Getters and Setters
    public String getName() {
        return forename;
    }

    public void setName(String name) {
        this.forename = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}