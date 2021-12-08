package com.example;

import java.util.List;

public class FamilyTreeDemo {
    public static void main(String[] args) {
        FamilyRelationShip family1 = new FamilyRelationShip();

        //create people
        People a = new People("A", true);
        People b = new People("B", false);
        People c = new People("C", true);
        People d = new People("D", false);
        People e = new People("E", true);
        People f = new People("F", false);
        People g = new People("G", true);
        People h = new People("H", false);
        People i = new People("I", true);
        People j = new People("J", true);
        People k = new People("K", true);
        People l = new People("L", true);
        People m = new People("M", true);
        People n = new People("N", true);
        People o = new People("O", true);

        //F1
        family1.addRoot(a);
        family1.marry(a, b);
        //F2
        family1.addChildren(a, c);
        family1.addChildren(a, d);
        family1.addChildren(a, e);

        family1.marry(c, f);
        family1.marry(d, g);
        family1.marry(e, h);
        //F3
        family1.addChildren(c,i);
        family1.addChildren(d, j);
        family1.addChildren(d,k);
        family1.addChildren(e, l);
        family1.addChildren(e, m);
        family1.addChildren(e, n);
        family1.marry(n, o);

        System.out.println("Pair that has 2 children:");

        for(People p: family1.has2Child(family1.getRoot())) {
            System.out.println(p);
        }

        System.out.println("Newest generation: ");
        List<People> result = family1.newestGeneration(family1.getRoot());
        for(People p: result) {
            System.out.println(p);
        }


    }
}
