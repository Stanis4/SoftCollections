package Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    //private static Logger logger = LogManager.getLogger(Collections.class.getName());

    //first task
    public static <K> int countWord(HashMap <K, String> hashMap,String word) {
        ArrayList<String> values = new ArrayList<>(hashMap.values());
        int counter = 0;
            for (String value :values){
                if (value.equals(word)){
                    counter+=1;
                }
        }return counter;
    }
}
