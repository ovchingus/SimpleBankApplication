package BankingApplication.account;

public class DepositAccountFactory {
    public static Account getAccount() {
        Account account = new DepositAccount();
        account.setAccountNumber(AccountNumberGenerator.getAccountNumber());
        account.setBalance(0.0);
        account.setInterestRate(0.0);
        account.setCommission(0.0);
        return account;
    }
}
