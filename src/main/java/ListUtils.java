import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {
    private static final Logger LOGGER = LogManager.getLogger(ListUtils.class);
    private static final ArrayList<String> arrayList = new ArrayList<>();

    public ListUtils chooseOption() {
        LOGGER.info("1. Print all words that start with 's'");
        LOGGER.info("2. Print all words");
        LOGGER.info("1. Print all words that have more than 5 symbols");
        System.out.println("Enter the option: ");
        String option = InputUtils.enterWord();
        switch (option) {
            case "1":
                LOGGER.info(getListBySymbol().toString());
                break;
            case "2":
                LOGGER.info(getAllWords().toString());
                break;
            case "3":
                LOGGER.info(getWordsMoreThanSymbols().toString());
                break;
            default:
                LOGGER.error("Incorrect option!");
        }
        return this;
    }

    public ListUtils collectToArray() {
        boolean engine = true;
        while (engine) {
            System.out.print("Enter the word. If you want end the entered - enter 'break': ");
            String word = InputUtils.enterWord();
            if (word.equalsIgnoreCase("break")) engine = false;
            else {
                arrayList.add(word);
            }
        }
        return this;
    }

    private List<String> getListBySymbol() {
        return arrayList.stream().filter(arrayList -> arrayList.startsWith("s")).collect(Collectors.toList());
    }

    private List<String> getAllWords() {
        return arrayList;
    }

    private List<String> getWordsMoreThanSymbols() {
        return arrayList.stream().filter(arrayList -> arrayList.length() > 5).collect(Collectors.toList());
    }
}
