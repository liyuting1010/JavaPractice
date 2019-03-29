package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collectMap = new HashMap<>();
        collection1.forEach(item -> collectMap.merge(item, 1, (a, b) -> a + b));
        return collectMap;
    }
}
