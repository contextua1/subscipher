package academy.learnprogramming;

import java.util.HashMap;
import java.util.Map;

public class Main {
    boolean solution(String string1, String string2) {
        // once a letter is assigned, must be used for same
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i<string1.length(); i++) {
            String key = string1.substring(i, i+1);
            String val = string2.substring(i, i+1);
            if (!map.containsKey(key)) {
                // already mapped to a different key
                if (map.containsValue(val)) return false;
                map.put(key, val);
            } else {
                if (!map.get(key).equals(val)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	        Main main = new Main();
        System.out.println(main.solution("abcdef", "ghijkk"));
    }
}
