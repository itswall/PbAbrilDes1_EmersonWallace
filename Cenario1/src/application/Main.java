package application;


import entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        // Patriarch and matriarch
        Person lily = new Person("Lily");
        lily.addSpouse(new Person("Wilhelm"));


        lily.addChild(new Person("Opa"));

        Person opa = new Person("Opa");
        opa.addSpouse(new Person("Oma"));


           lily.printFamilyTree();
    }
}