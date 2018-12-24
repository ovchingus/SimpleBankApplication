import BankingApplication.account.AccountNumberGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AccountNumberGeneratorTest {

    @Test
    public void accountNumberGeneratorTest() {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            list.add(AccountNumberGenerator.getAccountNumber());
        }

        for (Integer item : list) {
            if (item >= 9999999 || item <= 1000000)
                Assert.fail();
        }
    }
}
