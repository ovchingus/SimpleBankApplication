package BankingApplication.account;

import BankingApplication.account.Account;

public class CurrentAccount extends Account {

    public CurrentAccount() {
    }

    protected boolean isWithdrawingAllowed() {
        return true;
    }

    protected boolean isNegativeBalanceAllowed() {
        return false;
    }

    protected boolean isCommissionAllowed() {
        return false;
    }

    protected boolean isReplenishmentAllowed() {
        return true;
    }
}
