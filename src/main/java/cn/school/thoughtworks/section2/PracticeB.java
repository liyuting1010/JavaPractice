package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> collectMap = new HashMap<>();
        for (String item : collection1) {
            if (item.length() == 1) {
                collectMap.merge(item, 1, (a, b) -> a + b);
            } else {
                collectMap.put(String.valueOf(item.charAt(0)), (int) item.charAt(2) - (int) ('0'));

            }
        }

        return collectMap;
    }
}
