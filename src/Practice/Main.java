package Practice;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Queue<Character> q = new LinkedList<Character>();
        String s = "I love CMSC132 more than pizza!";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                q.add(s.charAt(i));
            }
        }
        System.out.println(q.size()); //1
    }
}

