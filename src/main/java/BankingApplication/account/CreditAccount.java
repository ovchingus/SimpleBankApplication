package BankingApplication.account;


public class CreditAccount extends Account {

    public CreditAccount() {
    }

    protected boolean isWithdrawingAllowed() {
        return true;
    }

    protected boolean isNegativeBalanceAllowed() {
        return true;
    }

    protected boolean isCommissionAllowed() {
        return true;
    }

    protected boolean isReplenishmentAllowed() {
        return true;
    }
}
