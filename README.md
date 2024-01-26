# Мій результат ↓ 

### Думаю виконав практичну на відмінно :)

## Customer.java

```java
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
```

![My result](/images/taskCustomer2.jpg)

## CustomerTest.java

```java
package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        
        Customer customer1 = new Customer();
        Customer customer2 = new Customer(2, 2000, false);

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.setID(-1);
        customer1.setTotal(2000);
        customer1.setIsNew(true);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
```

![My result](/images/taskCustomer1.jpg)

## Мій GitHub

![Static Badge](https://img.shields.io/badge/GitHub-181717?style=plastic&logo=GitHub&labelColor=black&color=white&link=https%3A%2F%2Fgithub.com%2FPavlitoo)


*Автор роботи: Луговий Павло 34  PPC NTU "KhPI"*
