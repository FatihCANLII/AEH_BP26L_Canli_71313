package pl.pp;

public class myNinthApp {

    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse(
                1,
                5000,
                "Default Owner",
                "default@email.com",
                "+48 000 000 000"
        );

        warehouse1.addGoods(3000);
        warehouse1.removeGoods(1000);
        warehouse1.addGoods(2500);
        warehouse1.checkOccupancy();

        warehouse1.updateContact(
                "owner@magazyn.pl",
                "+48 123 456 789"
        );

        warehouse1.addGoods(1000);
    }
}