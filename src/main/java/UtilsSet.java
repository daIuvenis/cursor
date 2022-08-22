import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UtilsSet {
    private static final Logger LOGGER = LogManager.getLogger(UtilsSet.class);
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Set<Shop> VALUES;

    public UtilsSet getSortedHashMap() {
        VALUES = new HashSet<>();
        setValues();
        try {
            for (Shop s : VALUES
            ) {
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            LOGGER.error(e);
        }
        return this;
    }

    private UtilsSet setValues() {
        VALUES.add(new Shop("sda", 12));
        VALUES.add(new Shop("das", 1123));
        VALUES.add(new Shop("jkhg", 1212));
        VALUES.add(new Shop("hjas", 132));
        return this;
    }
}