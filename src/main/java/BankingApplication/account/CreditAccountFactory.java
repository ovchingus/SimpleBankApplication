package BankingApplication.account;

public class CreditAccountFactory {
    public static Account getAccount() {
        Account account = new CreditAccount();
        account.setAccountNumber(AccountNumberGenerator.getAccountNumber());
        account.setBalance(0.0);
        account.setInterestRate(0.0);
        account.setCommission(12.5);
        return account;
    }
}
