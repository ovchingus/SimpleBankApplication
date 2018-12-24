package BankingApplication.account;

import java.util.Random;

public class AccountNumberGenerator {

    public AccountNumberGenerator() {
    }

    public static Integer getAccountNumber() {
        int min = 1000000;
        int max = 9999999;
        int diff = max-min;
        Random random = new Random();
        return random.nextInt(diff) + min;
    }
}
