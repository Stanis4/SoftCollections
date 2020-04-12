package Runner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Collection.CollectionMethods;

import java.util.*;

public class Runner {
    public static Logger logger = LogManager.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        String word = "Dan";

        HashMap <Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Jessy");
        hashMap.put(3, "Daniel");
        hashMap.put(4, "Dan");
        hashMap.put(2, "Donny");
        hashMap.put(5, "Peter");
        hashMap.put(6, "Dan");
        logger.info("First task: The word '"+ word + "' repeats " + CollectionMethods.countWord(hashMap, word) + " times");

        List<String> arrays = Arrays.asList("11", "22", "33", "44", "55");
        logger.info("Second task: " + CollectionMethods.getStringOfAllElements(new HashSet<Object>(arrays)));

        logger.info("Third task: " + CollectionMethods.getValuesOfHashMap(hashMap));

        ArrayList<String> arrayList = new ArrayList<>(arrays);
        logger.info("Forth task: " + CollectionMethods.getElementsByPosition(arrayList, 4));

        logger.info("Fifth task: " + CollectionMethods.reverseArrayList(arrayList));
    }
}

