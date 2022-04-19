package interviewpreparationkit.stringmanipulation;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class SpecialStringAgain {

    static long substrCount(int n, String s) {
        System.out.println("begin");
        Instant start = Instant.now();
        long l = buildSubstringMemory(n, s, new HashMap<String, Boolean>(), 0, 0);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("String:" + s + " Total:" + timeElapsed);
        System.out.println("end");
        return l;
    }

    static long buildSubstringMemory(int n, String s, Map<String, Boolean> memory, int index, long count) {

        Instant start = Instant.now();
        String key = buildKey(s, index);

        if (memory.containsKey(key) || n == 0) {
            Instant finish = Instant.now();
            long timeElapsed = Duration.between(start, finish).toMillis();
            System.out.println("String: " + s + " TimeA: " + timeElapsed);

            return count;
        }

        if (n == 1) {
            memory.put(key, Boolean.TRUE);
            ++count;
        } else {
            String left = s.substring(0, n - 1);
            String right = s.substring(1, n);
            if (n <= 3) {
                count = buildSubstringMemory(n - 1, left, memory, index, count);
                count = buildSubstringMemory(n - 1, right, memory, index + 1, count);

                boolean special = s.charAt(0) == s.charAt(n - 1);
                memory.put(key, special);

                if (special) {
                    ++count;
                }
            } else {
                count = buildSubstringMemory(n - 1, left, memory, index, count);
                count = buildSubstringMemory(n - 1, right, memory, index + 1, count);

                String substringKey = buildKey(s.substring(1, n - 1), index + 1);

                boolean special = s.charAt(0) == s.charAt(1) && s.charAt(n - 2) == s.charAt(n - 1)
                        && memory.get(substringKey);
                memory.put(key, special);

                if (special) {
                    ++count;
                }
            }
        }

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("String: " + s + " TimeB: " + timeElapsed);

        return count;
    }

    private static String buildKey(String s, int index) {
        return s + "_" + index;
    }

}
