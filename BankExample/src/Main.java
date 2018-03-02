public class Main {

    public static void main(String[] args) {
        BankAccount client1 = new BankAccount();
        BankAccount client2 = new BankAccount();

        System.out.println("Bad client: ");
        client1.setCustomerName("Abca");
        System.out.println(client1.getCustomerName());

        client1.setCustomerMail("Wrong@aaa");
        System.out.println(client1.getCustomerMail());

        client1.setBalance(1234);
        System.out.println(client1.getBalance());

        client1.setCustomerPhone("423 222");
        System.out.println(client1.getCustomerPhone());

        System.out.println("\nGood client: ");
        client2.setCustomerName("John Smith");
        System.out.println(client2.getCustomerName());

        client2.setCustomerMail("john@goodmail.com");
        System.out.println(client2.getCustomerMail());

        client2.setBalance(1024_00);
        System.out.println(client2.getBalance());

        client2.setCustomerPhone("123 456 789");
        System.out.println(client2.getCustomerPhone());
    }
}
