package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Person spouse;
    private List<Person> children;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addSpouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;

    }

    public void printFamilyTree(){
        System.out.println(getName() + " -- Married to: " + spouse.getName() + " -- Their children: \n" + children.get(0).getName());

    }

    public void printFamilyTreeHelper(Person person, int aux){

    }
}






