package pl.pp;

public class myEighthApp {

    public static void main(String[] args) {

        // Person
        Person p1 = new Person();
        p1.setName("John");
        p1.setSurname("Doe");
        p1.setAge(24);
        p1.hiToAll();

        Person p2 = new Person("Alice", "Hart", 42);
        p2.hiToAll();

        p1.growOld();
        for (int i = 0; i < 3; i++) {
            p2.growOld();
        }

        p1.hiToAll();
        p2.hiToAll();

        // Circle
        Circle c = new Circle(5.0);
        c.getInfo();

        // Account
        Account acc = new Account(
                "123456789",
                1000.0,
                "Fatih",
                "mail@test.com",
                "123456789"
        );

        acc.withdraw(900.0);
        acc.deposit(250.0);
        acc.withdraw(50.0);
        acc.withdraw(400.0);
    }
}