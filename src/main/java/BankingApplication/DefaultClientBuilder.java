package BankingApplication;

import BankingApplication.account.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder for client with first and last name, address and pass. number.
 */
public class DefaultClientBuilder implements ClientBuilder {

    private Client client = new Client();

    /**
     * Reset choosen options
     */
    public void reset() {
        client = new Client();
    }

    /**
     * Sets client name
     *
     * @param firstName first name of client
     */
    public void setFirstName(String firstName) {
        client.setFirstName(firstName);
    }

    /**
     * Sets client surname
     *
     * @param lastName last name of client
     */
    public void setLastName(String lastName) {
        client.setLastName(lastName);
    }

    /**
     * Set clients passport number
     *
     * @param passportNumber number to set
     */
    public void setPassport(Integer passportNumber) {
        client.setPassportNumber(passportNumber);
    }

    /**
     * Set client address
     *
     * @param address address to set
     */
    public void setAddress(String address) {
        client.setAdress(address);
    }

    public void addAccount(Account account) {
        if (client.getAccounts() == null)
            client.setAccounts(new ArrayList<Account>());
        account.setOwner(client);
        client.addAccount(account);
    }

    public void addAccount(List<Account> accounts) {
        if (client.getAccounts() == null)
            client.setAccounts(new ArrayList<Account>());
        for (Account item : accounts)
            item.setOwner(client);
        client.addAccount(accounts);
    }

    /**
     * Get builded client
     *
     * @return Client object
     */
    public Client getResult() {
        return client;
    }
}
