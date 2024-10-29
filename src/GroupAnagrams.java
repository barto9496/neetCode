import java.util.*;

public class GroupAnagrams {
    public List<List<String>> getAnagramGroup (String [] strs){
        //The final string: {"act","pots","tops","cat","stop","hat"}
        if(strs.length ==0) return new ArrayList<>();
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for(String st: strs){
           int[] count = new int[26];
           Arrays.fill(count, 0);
           for(char ch: st.toCharArray()){
              count[ch-'a']++;
           }

           StringBuilder sb = new StringBuilder();
           for(int i =0; i<26; i++){
               sb.append('#');
               sb.append(count[i]);
           }

           String key = sb.toString();

           if(!anagramGroup.containsKey(key)){
                anagramGroup.put(key, new ArrayList<>());
           }
           anagramGroup.get(key).add(st);
        }
        return new ArrayList<>(anagramGroup.values());
    }
}
