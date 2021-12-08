package com.example;

import java.util.ArrayList;
import java.util.List;

public class FamilyRelationShip {

    private People root;

    public void addRoot(People people){
        this.root = people;
    }

    public void addChildren(People parent, People children) {
        children.setParent(parent);
        parent.getChildren().add(children);
    }

    public void marry(People male, People female) {
        male.setPartner(female);
        female.setPartner(male);
        male.setChildren(female.getChildren());
    }

    public void traverse(People people) {
        System.out.println(people);
        for(People child: people.getChildren()) {
            traverse(child);
        }
    }

    public People getRoot() {
        return root;
    }

    public int height(People p) {
        if(p.getChildren().isEmpty()) {
            return 1;
        }
        int max = 0;
        for(People child: p.getChildren()) {
            int h = height(child);
            if(h + 1 > max) {
                max = h + 1;
            }
        }
        return max;
    }

    public List<People> has2Child(People p){
        List<People> peopleHas2Children = new ArrayList<>();
        if(p.getChildren().size() >= 2) {
            peopleHas2Children.add(p);
        }

        for(People child: p.getChildren()){
            peopleHas2Children.addAll(has2Child(child));
        }
        return peopleHas2Children;

    }

    public List<People> newestGeneration(People p) {
        List<People> result = new ArrayList<>();
        int height = height(root);
        searchNewGeneration(p,height, result);
        return result;
    }

    private void searchNewGeneration(People p, int height, List<People> result) {
        if(heightNode(p) == height) {
            result.add(p);
        }
        for(People child: p.getChildren()) {
            searchNewGeneration(child, height, result);
        }
    }

    private int heightNode(People p) {
        if(p == root) {
            return 1;
        }
        return heightNode(p.getParent()) + 1;
    }
}
