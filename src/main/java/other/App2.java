package other;

import java.util.HashSet;

public class App2 {

    public static void main(java.lang.String[] args) {
        System.out.println(getCommonChars("ABC", "ABC"));
    }

    public static int commonChild(java.lang.String s1, java.lang.String s2) {
        int totalChild = 0;

        java.lang.String s3 = getCommonChars(s1, s2);

        return totalChild;
    }

    private static java.lang.String getCommonChars(java.lang.String s1, java.lang.String s2) {
        var set1 = new HashSet<Character>();
        s1.chars().forEach(e -> set1.add((char) e));

        var set2 = new HashSet<Character>();
        s2.chars().forEach(e -> set2.add((char) e));

        set1.retainAll(set2);

        return set1.toString();
    }



}
