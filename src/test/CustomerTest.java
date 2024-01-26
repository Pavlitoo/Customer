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
