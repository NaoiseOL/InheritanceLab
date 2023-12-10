package ie.atu;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Naoise","Terryland","086 037 ","4342",true);
        Customer customer2 = new Customer();

        customer2.setPersonName();
        customer2.setPersonAddress();
        customer2.setPersonPhone();
        customer2.setCustomerNumber("5442");
        customer2.setMailingList(false);

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}