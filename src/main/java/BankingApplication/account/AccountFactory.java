package BankingApplication.account;

import BankingApplication.exceptions.InvalidAccountTypeException;

/**
 * Class contains factory method for Account creating.
 */
public class AccountFactory {

    /**
     * Factory method which creates Account class by string code(name) of Account type
     * @param accountType string name of account
     * @return Created class object of necessary account
     * @throws InvalidAccountTypeException - if account name isn't valid
     */
    public static Account getAccount(String accountType) throws InvalidAccountTypeException {
        Account account = null;
        if (accountType.equalsIgnoreCase("current"))
            account = CurrentAccountFactory.getAccount();
        if (accountType.equalsIgnoreCase("credit"))
            account = CreditAccountFactory.getAccount();
        if (accountType.equalsIgnoreCase("deposit"))
            account = DepositAccountFactory.getAccount();

        if (account != null)
            return account;
        else throw new InvalidAccountTypeException("There is no account type with code: \"" +
                accountType + "\".");
    }
}

