/*
Bank Accout Test
 */
package bankaccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount(1000);
        MyAccount.depost(500);
        MyAccount.withdraw(2000);
        MyAccount.addInterest(1);
        System.out.printf("%.2f\n", MyAccount.getBalance());
        System.out.println("Expected: 1504.90");
    }
}
