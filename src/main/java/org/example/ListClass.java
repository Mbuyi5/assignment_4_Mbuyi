package org.example;

import java.util.LinkedList;
import java.util.List;

public class ListClass {
    static List<String> list = new LinkedList<>();

    public static void addStr(){
        list.add("school");
        list.add("together");
    }

    public static void setStr(int idx,String str){
        list.set(idx, str);
    }
}
