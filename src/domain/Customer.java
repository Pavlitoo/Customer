package domain;

public class Customer {
    private int ID;
    private double total;
    private boolean isNew;

    public Customer() {
        this(1, 1000, true);
    }

    public Customer(int ID, double total, boolean isNew) {
        this.ID = ID;
        this.total = total;
        this.isNew = isNew;
    }

    // Конструктор за замовчуванням
    public Customer(int ID) {
        this(ID, 3000, true);
    }

    public void displayCustomerInfo() {
        System.out.println("\nCustomer: ID: \t\t" + this.ID + "\nCustomer total: \t" + this.total + "\nCustomer is new: \t"
                + this.isNew + "\n");
    }

    public int getID() {
        return this.ID;
    }

    public double getTotal() {
        return this.total;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public boolean setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
            return true;
        }
        return false;
    }

    public boolean setIsNew(boolean isNew) {
        // Якщо параметр isNew не нульовий, то змінюємо статус клієнта і повертаємо true,
        // інакше повертаємо false
        if (isNew != this.isNew) {
            this.isNew = isNew;
            return true;
        }
        return false;
    }

    public boolean setTotal(double total) {
        if (total >= 0) {
            this.total = total;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + ID + ", total=" + total + ", isNew=" + isNew + "]";
    }
}
