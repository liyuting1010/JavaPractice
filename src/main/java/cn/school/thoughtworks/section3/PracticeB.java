package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。

        for (String item : object.get("value")) {
            if (collectionA.containsKey(item)) {
                Integer value = collectionA.get(item);
                collectionA.put(item, value - value / 3);
            }
        }

        return collectionA;
    }
}
