package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import static org.junit.Assert.*;

public class TestCollections {

    // Testing the interface: Set
    @Test
    public void isIsogram() {
        Assert.assertTrue(SetClass.isIsogram("ADP"));
    }

    // Testing the interface: Map
    @Test
    public void doesEmployeeExist(){
        MapClass.loadEmployees();
        Assert.assertTrue(MapClass.getMap().containsKey("Alpha"));
    }


    // Testing the interface: List
    @Test
    public void isAtRightIndex(){
        ListClass.addStr();
        ListClass.setStr(1, "CPUT");

        Assert.assertNotEquals(ListClass.list.get(1).toString(), "together");
    }

    // Testing the interface: Collection
    @Test
    public void containsElement(){
        CollectionClass cc = new CollectionClass();
        cc.addElement(90);

        Assert.assertFalse(cc.getVector().contains(45));
    }
}