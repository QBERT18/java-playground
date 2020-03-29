package problem5_smallest_multiple;

import java.util.HashMap;
import java.util.Map;

public class SmallestMultiple {
    private HashMap<Integer, Integer> storage = null;
    int counter = 0;
    int result = 0;
    public int getSmallestMultiple() {
        storage = new HashMap<Integer, Integer>();
        for(int i = 1; i <= 300000000; i++) {
            counter = 0;
            if(i % 20 == 0) {
                counter++;
                for (int j = 20 - 1; j >= 1; j--) {
                    if(i % j == 0) {
                        counter++;
                        storage.remove(i);
                        storage.put(i, counter);
                    } else {
                        storage.remove(i);
                        counter = 0;
                        break;
                    }
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : storage.entrySet()) {
            if(entry.getValue() == 20)
                result = entry.getKey();
        }
        return result;
    }
}
