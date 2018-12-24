package BankingApplication.account;

import BankingApplication.exceptions.ReplenishmentDenied;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DepositAccount extends Account {

    public DepositAccount() {
    }

    private Date expirationDate = new Date();

    public void setExpirationDate(String date) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            expirationDate = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    protected boolean isWithdrawingAllowed() {
        Date currDate = new Date();
        return currDate.after(expirationDate);
    }

    /**
     * Each 100.000 rub in first replenishment adds
     * 1% to interest rate.
     * @param money amount of first payment
     */
    @Override
    public void replenishment(Double money) throws ReplenishmentDenied {
        Date currDate = new Date();
        if (currDate.before(expirationDate) &&
                super.getBalance().equals(0.0)) {
            super.setInterestRate((money / 100000.0));
        }
        super.replenishment(money);
    }

    protected boolean isNegativeBalanceAllowed() {
        return false;
    }

    protected boolean isCommissionAllowed() {
        return false;
    }

    protected boolean isReplenishmentAllowed() {
        Date currDate = new Date();
        return currDate.before(expirationDate);
    }
}
