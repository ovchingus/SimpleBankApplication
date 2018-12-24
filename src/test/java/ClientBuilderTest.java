import BankingApplication.Client;
import BankingApplication.ClientBuilder;
import BankingApplication.DefaultClientBuilder;
import BankingApplication.account.*;
import BankingApplication.exceptions.InvalidAccountTypeException;
import org.junit.Assert;
import org.junit.Test;

public class ClientBuilderTest {

    @Test
    public void BuilderUntrustedClientTest() {

        ClientBuilder builder = new DefaultClientBuilder();
        builder.setFirstName("Arnold");
        builder.setLastName("Swartchneger");
        Client arnold = ((DefaultClientBuilder) builder).getResult();

        Assert.assertNotNull(arnold);
    }

    @Test
    public void BuilderTrustedClientTest() {
        ClientBuilder builder = new DefaultClientBuilder();
        builder.setFirstName("Max");
        builder.setLastName("Pavlov");
        builder.setAddress("Akademgorodok, 12A, 53");
        builder.setPassport(1000000);
        Client client = ((DefaultClientBuilder) builder).getResult();
        Assert.assertNotNull(client);
    }

    @Test
    public void clientWithAccountTest() throws InvalidAccountTypeException {
        ClientBuilder builder = new DefaultClientBuilder();

        builder.setLastName("keks");
        builder.setFirstName("kolyan");
        builder.setAddress("abcd");
        builder.setPassport(1000000);

        CreditAccount account = (CreditAccount) AccountFactory.getAccount("credit");
        builder.addAccount(account);

        Client client = ((DefaultClientBuilder) builder).getResult();
        Assert.assertNotNull(client);
        Assert.assertNotNull(client.getAccounts());
    }

}
