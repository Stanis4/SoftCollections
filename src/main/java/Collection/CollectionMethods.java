package Collection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

public class CollectionMethods {

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

    //Second task
    public static <V> String getStringOfAllElements(HashSet<V> hashSet) {
        StringBuilder allElements = new StringBuilder();
        for (V element : hashSet) {
            allElements.append(element.toString()).append(", ");
        }
        return allElements.toString();
    }

    //Third task
    public static <K, V> HashSet<V> getValuesOfHashMap(HashMap<K, V> hashMap) {
        return new HashSet<>(hashMap.values());
    }

    //Forth task
    public static <T> String getElementsByPosition(ArrayList<T> arrayList, int index) {
        return arrayList.get(index).toString();
    }

    //Fifth task
    public static <E> ArrayList<E> reverseArrayList(ArrayList<E> arrayList) {
        System.out.println("Start to reverse ArrayList " + arrayList.toString());
        Collections.reverse(arrayList);
        return arrayList;
    }
}
