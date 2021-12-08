package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class People {
    private String name;
    private boolean isMale = true;
    private People partner = null;
    private People parent;
    private List<People> children = new ArrayList<>();

    public People() {
    }

    public People(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public People getPartner() {
        return partner;
    }

    public void setPartner(People partner) {
        this.partner = partner;
    }

    public List<People> getChildren() {
        return children;
    }

    public void setChildren(List<People> children) {
        this.children = children;
    }

    public People getParent() {
        return parent;
    }

    public void setParent(People parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return name + (partner != null ? " + " + partner.getName() : "");
    }
}
