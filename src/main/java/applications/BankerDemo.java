package applications;

public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank nursultanDemirBankAccount = new DemirBank(118000000123L,123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(118000003121L,987654321);

        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);
        System.out.println("After deposit " + nursultanDemirBankAccount.getBalance());

        Bank.transferFunds(nursultanDemirBankAccount,urmatDemirBankAccount,2000);
        System.out.println("Urmat's balance after transfer is : " + urmatDemirBankAccount.getBalance());
        System.out.println(" Nursultan's balance after transfer is : " + nursultanDemirBankAccount.getBalance());

        Bank.transferFunds(urmatDemirBankAccount,nursultanDemirBankAccount,100000);
        System.out.println(nursultanDemirBankAccount.getBalance());
    }
}
