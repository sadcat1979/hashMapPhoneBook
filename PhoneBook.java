import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, List<Long>> bookMap = new HashMap<>();

    public void addEntry(String name, Long number) {
        List<Long> nums = bookMap.getOrDefault(name, new ArrayList<>());
        nums.add(number);
        bookMap.put(name, nums);
    }

    public void print() {
        List<Map.Entry<String, List<Long>>> outputList = new ArrayList<>(bookMap.entrySet());
        outputList.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());
        for (Map.Entry<String, List<Long>> entry : outputList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}