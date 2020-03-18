package org.example;

/*
  An isogram is a word that has no repeating letters,
  consecutive or non-consecutive.
 */

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    public static boolean isIsogram(String str) {
        Set<Character> letters = new HashSet<Character>();

        for (int i = 0; i < str.length(); ++i) {
            if (letters.contains(str.toLowerCase().charAt(i))) {
                return false;
            }

            letters.add(str.charAt(i));
        }

        return true;
    }
}

