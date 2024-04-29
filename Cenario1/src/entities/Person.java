package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Person> spouse;
    private List<Person> children;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
        this.spouse = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getSpouse() {
        return spouse;
    }

    public void setSpouse(List<Person> spouse) {
        this.spouse = spouse;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void addChild(Person person) {

    }

    public String addSpouse(Person person) {
        spouse.add(person);
        return person.toString();
    }

    public void printFamilyTree(){
        System.out.println(getName() + " -- Married to: " + spouse.get(0).getName());
    }
}
