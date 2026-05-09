package pl.pp;

public class Warehouse {

    private int warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;

    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Warehouse(int warehouseNumber,
                     int totalSpace,
                     String ownerName,
                     String ownerEmail,
                     String ownerPhone) {

        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0;

        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    // GETTERS

    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    // SETTERS

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public void setTotalSpace(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    // METHODS

    public void addGoods(int amount) {

        int freeSpace = totalSpace - occupiedSpace;

        if (amount <= freeSpace) {

            occupiedSpace += amount;

            System.out.println(
                    "Added " + amount +
                            " units of goods. Remaining warehouse space: "
                            + (totalSpace - occupiedSpace) + " units."
            );

        } else {

            System.out.println(
                    "Not enough space in the warehouse. Remaining warehouse space: "
                            + freeSpace + " units."
            );
        }
    }

    public void removeGoods(int amount) {

        if (amount <= occupiedSpace) {

            occupiedSpace -= amount;

            System.out.println(
                    "Removed " + amount +
                            " units of goods. Remaining warehouse space: "
                            + (totalSpace - occupiedSpace) + " units."
            );

        } else {

            System.out.println(
                    "Cannot remove more goods than available."
            );
        }
    }

    public void checkOccupancy() {

        System.out.println(
                "Occupied warehouse space: "
                        + occupiedSpace + " units."
        );

        System.out.println(
                "Available warehouse space: "
                        + (totalSpace - occupiedSpace) + " units."
        );
    }

    public void updateContact(String newEmail, String newPhone) {

        ownerEmail = newEmail;
        ownerPhone = newPhone;

        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + ownerEmail);
        System.out.println("New phone number: " + ownerPhone);
    }
}