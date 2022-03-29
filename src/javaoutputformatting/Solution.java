package javaoutputformatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            String txt = "%s".concat(" ".repeat(15 - s1.length())).concat("%03d\n");
            System.out.printf(txt, s1, x);
        }
        System.out.println("================================");

    }
}