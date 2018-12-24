package BankingApplication.account;

public class CurrentAccountFactory {
    public static Account getAccount() {
        Account account = new CurrentAccount();
        account.setAccountNumber(AccountNumberGenerator.getAccountNumber());
        account.setBalance(0.0);
        account.setInterestRate(10.0);
        account.setCommission(0.0);
        return account;
    }
}
