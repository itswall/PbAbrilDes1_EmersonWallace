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
        printFamilyTreeHelper(this, 0);
    }


    public void printFamilyTreeHelper(Person person, int rec) {

        StringBuilder fancyLine = new StringBuilder();
        for(int i=0; i<rec; i++){
            fancyLine.append("  ");
        }

        System.out.print(fancyLine + person.getName());

        if(person.spouse != null){
            System.out.println(fancyLine.delete(0, 4) + "-- Married to: " + person.spouse.getName() + " -- Their children:");
        }
        else if(person.children == null){
            System.out.println(fancyLine + "-- None");
        }
        else{
            System.out.println(fancyLine.delete(0, 5) + "-- Single");
        }
        for(Person child : person.getChildren()){
            printFamilyTreeHelper(child, rec + 1);
        }
    }
}






