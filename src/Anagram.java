import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;

        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1 );
        }

        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }

            map.put(ch, map.get(ch) - 1);

        }
        return true;
    }
}
