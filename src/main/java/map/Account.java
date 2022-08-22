package map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Account {
    private static final Logger LOGGER = LogManager.getLogger(Account.class);

    private String userName, password;
    public static Map<Person, Account> accountMap = new HashMap<>();
    public static Set<Person> personKeys;

    public Account setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public Account() {

    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account createAccount(Person person, Account account) {
        accountMap.put(person, account);
        return this;
    }

    public Person deleteAccount(int personKey) {
        personKeys = accountMap.keySet();
        try {
            for (Person i : personKeys) {
                if (i.getKeyId() == personKey) {
                    accountMap.get(i).setUserName(null);
                    accountMap.get(i).setPassword(null);
                }
            }
            LOGGER.info("Was been deleted account");
        } catch (Exception e) {
            LOGGER.error(e);
        }


        return new Person();
    }

    public Account printAllAccounts() {
        for (Map.Entry<Person, Account> entry : accountMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        return this;
    }

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", password='" + password + '\'';
    }
}