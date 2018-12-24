package BankingApplication;

import BankingApplication.account.Account;

import java.util.List;

/**
 * Интерфейс строителя объявляет все возможные этапы и шаги
 * конфигурации продукта.
 */
public interface ClientBuilder {

    /**
     * Используется для сброса билдера
     */
    public void reset();

    /**
     * Sets client name
     *
     * @param firstName first name of client
     */
    public void setFirstName(String firstName);

    /**
     * Sets client surname
     *
     * @param lastName last name of client
     */
    public void setLastName(String lastName);

    /**
     * Установить номер пасспорта
     */
    public void setPassport(Integer passport);

    /**
     * Установить адрес
     */
    public void setAddress(String address);

    /**
     * Add an account
     */
    public void addAccount(Account account);

    /**
     * Add many accounts
     */
    public void addAccount(List<Account> accounts);
}
