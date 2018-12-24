package BankingApplication;

import BankingApplication.account.Account;

import java.util.List;

public class Client {
    private String firstName;

    private String lastName;

    private String adress;

    private Integer passportNumber;

    private List<Account> accounts;

    public Client() {
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client(String firstName, String lastName, String adress, Integer passportNumber, List<Account> accounts) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.adress = adress;
            this.passportNumber = passportNumber;
            this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addAccount(List<Account> accountList) {
        accounts.addAll(accountList);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }
}

