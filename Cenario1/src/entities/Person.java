package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Person spouse;
    private List<Person> children;

    //Construtor vazio
    public Person() {
    }

    // Construtor com parâmetro
    public Person(String name, Person spouse) {
        this.name = name;
        this.spouse = spouse;
        this.children = new ArrayList<>();
    }

    // Construtor com parâmetro/2
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

    // Metodo para adicionar um filho na lista de filhos
    public void addChild(Person child) {
        children.add(child);
    }

    // Metodo para adicionar conjuge passando Person como parâmetro
    public void addSpouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;

    }

    // Metodo recursivo printFamilyTree (Negocio chato demorei pra pensar como era)
    public void printFamilyTree(){
        printFamilyTreeHelper(this, 0);
    }


    // Metodo para imprimir a arvore
    public void printFamilyTreeHelper(Person person, int rec) {

        // StringBuilder para melhorar a formatação e a recursirvidade
        StringBuilder fancyLine = new StringBuilder();
        for(int i=0; i<rec; i++){
            fancyLine.append("  ");
        }

        System.out.print(fancyLine + person.getName());

        if(person.spouse != null){
            System.out.println(fancyLine.delete(0, 5) + " -- Married to: " + person.spouse.getName() + " -- Their children: ");
        }
        else{
            System.out.println(fancyLine.delete(0, 4) + "-- Single");
        }
        for(Person child : person.getChildren()){
            printFamilyTreeHelper(child, rec + 1);
        }
    }
}






