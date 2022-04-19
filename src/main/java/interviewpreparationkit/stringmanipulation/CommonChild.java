package interviewpreparationkit.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class CommonChild {

    public static int commonChild(String s1, String s2) {
        int maxChildSize = s1.length();

        int totalChild = 0;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Map<Character, Integer> m1 = new HashMap<>();
        for(int i = 0; i< chars1.length; i++) {
            m1.put(chars1[i], i);
        }

        Map<Character, Integer> m2 = new HashMap<>();
        for(int i = 0; i< chars2.length; i++) {
            char c = chars2[i];
            if(m1.containsKey(c)) {
                m2.put(c, i);
            } else {
                chars2[i] = '_';
            }
        }

        for(int i = 0; i< chars2.length; i++) {
            char c = chars1[i];
            if(!m2.containsKey(c)) {
                m1.remove(c);
                chars1[i] = '_';
            }
        }

        StringBuilder maxChild = new StringBuilder();
        for(int i = 0; i< chars1.length; i++) {
            char c = chars1[i];

        }

        for(int i = 0; i< chars1.length; i++) {
            char c = chars1[i];
            int index1 = m1.get(c);
            Integer index2 = m2.get(c);

            if(index2==null) {
                maxChildSize--;
            } else {
                maxChild.append(c);
            }

        }

        return totalChild;
    }

}
