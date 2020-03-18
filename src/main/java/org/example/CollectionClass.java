package org.example;

import java.util.Collection;
import java.util.Vector;

public class CollectionClass {
    Collection<Integer> vector = new Vector<>();

    public void addElement(int num){
        vector.add(num);
    }

    public Collection<Integer> getVector(){
        return vector;
    }
}
