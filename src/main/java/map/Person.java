package map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static map.Account.accountMap;
import static map.Account.personKeys;

public class Person {
    private int keyId;
    private static final Logger LOGGER = LogManager.getLogger(Person.class);


    public int getKeyId() {
        return keyId;
    }

    public Person() {
    }

    public Person(int keyId) {
        this.keyId = keyId;
    }

    public Account deletePerson(int personKey) {
        personKeys = accountMap.keySet();
        List<Person> toRemove = new ArrayList<>();
        try {
            for (Person i : personKeys) {
                if (i.getKeyId() == personKey) toRemove.add(i);
            }
            try {
                for (int i = 0; i < toRemove.size(); i++) {
                    accountMap.remove(toRemove.get(i));
                    LOGGER.info("Persons were been deleted");

                }
            } catch (Exception e) {
                LOGGER.error(e);
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }

        return new Account();
    }

    @Override
    public String toString() {
        return "keyId=" + keyId;
    }
}