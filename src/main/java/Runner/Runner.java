package Runner;
import Collection.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

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
        logger.info("The word '"+ word + "' repeats " + Collections.countWord(hashMap, word) + " times");
    }
}

