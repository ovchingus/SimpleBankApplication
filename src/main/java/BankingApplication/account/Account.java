package BankingApplication.account;

import BankingApplication.Client;
import BankingApplication.exceptions.NegativeBalanceDeniedException;
import BankingApplication.exceptions.ReplenishmentDenied;
import BankingApplication.exceptions.TransferException;
import BankingApplication.exceptions.WithdrawDeniedException;

/**
 * Parent class of all Account types.
 */
public abstract class Account {

    /**
     * Owner of account
     */
    private Client owner;

    /**
     * Unique id of account
     */
    private Integer accountNumber;

    /**
     * Current balance on account
     */
    private Double balance;

    /**
     * Percent (Interest Rate) for remaining balance
     */
    private Double interestRate;

    /**
     * Current commission for money withdraw
     */
    private Double commission;

    protected abstract boolean isWithdrawingAllowed();

    protected abstract boolean isNegativeBalanceAllowed();

    protected abstract boolean isCommissionAllowed();

    protected abstract boolean isReplenishmentAllowed();

    /**
     * Template method for money withdrawing. Provides check of next conditions:
     * isWithdrawingAllowed, isNegativeBalanceAllowed, isCommissionAllowed
     * Used for CreditAccount, CurrentAccount and DepositAccount.
     *
     * @param money - amount of money to withdraw
     * @throws WithdrawDeniedException        - if withdraw is denied
     * @throws NegativeBalanceDeniedException - if negative balance is denied
     */
    public void withdraw(Double money) throws WithdrawDeniedException, NegativeBalanceDeniedException {
        if (isWithdrawingAllowed()) {
            if (money <= balance) {
                balance -= money;
            } else {
                if (isNegativeBalanceAllowed()) {
                    balance -= money;
                    if (isCommissionAllowed())
                        balance -= (money / 100) * commission;
                } else {
                    throw new NegativeBalanceDeniedException("Negative balance is denied.", this.getClass());
                }
            }
        } else {
            throw new WithdrawDeniedException("Withdraw is denied.", this.getClass());
        }
    }

    /**
     * Template method for money replenishment. Provides check of next conditions:
     * isReplenishmentAllowed.
     * Used especially for DepositAccount class.
     *
     * @param money - amount of money to add to balance.
     * @throws ReplenishmentDenied - if replenishment is denied.
     */
    public void replenishment(Double money) throws ReplenishmentDenied {
        if (isReplenishmentAllowed())
            balance += money;
        else throw new ReplenishmentDenied("Replenishment is denied", this.getClass());
    }

    /**
     * TODO: account search by accountNumber without database
     *
     * @param money   - amount of money to transfer to balance of recipient.
     * @param account - account of recipient.
     * @throws TransferException - if transfer failed.
     */
    public void transfer(Double money, Account account) throws TransferException {

        if (isWithdrawingAllowed()) {
            if (money <= balance) {
                balance -= money;
            }
        } else {
            throw new TransferException("Transfer error, withdraw is denied.", this.getClass());
        }
        if (account.isReplenishmentAllowed())
            account.balance += money;
        else throw new TransferException("Transfer error, replenishment is denied", this.getClass());
    }

    public Account() {
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }
}
