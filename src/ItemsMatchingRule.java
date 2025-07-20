package src;
import java.util.*;

public class ItemsMatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;

        // Determine which index to check based on ruleKey
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }

        int count = 0;

        // Go through each item and check if it matches the rule
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println(result);
    }
}

