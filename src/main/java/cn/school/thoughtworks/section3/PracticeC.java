package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collectMap = new HashMap<>();
        collectionA.forEach(item -> collectMap.merge(item, 1, (a, b) -> a + b));

        for (String item : object.get("value")) {
            if (collectMap.containsKey(item)) {
                Integer value = collectMap.get(item);
                collectMap.put(item, value - value / 3);
            }
        }

        return collectMap;
    }
}
