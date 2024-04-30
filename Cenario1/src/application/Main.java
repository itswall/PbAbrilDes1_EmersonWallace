package application;


import entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Patriarch and matriarch
        Person lily = new Person("Lily");
        lily.addSpouse(new Person("Wilhelm"));

        // Children of Lily and Wilhelm
        Person opa = new Person("Opa");
        lily.addChild(opa);

        // Spouse of Oma
        Person oma = new Person("Oma");
        opa.addSpouse(oma);

        // Children of Oma and Opa
        Person reinhold = new Person("Reinhold");
        Person wilma = new Person("Wilma");
        Person sigrid = new Person("Sigrid");

        opa.addChild(reinhold);
        opa.addChild(wilma);
        opa.addChild(sigrid);

        // Spouse of Reinhold
        reinhold.addSpouse(new Person("Sonia"));

        // Children of Reinhold and Sonia
        Person christian = new Person("Christian");
        Person gabrielle = new Person("Gabrielle");
        Person sabine = new Person("Sabine");

        reinhold.addChild(christian);
        reinhold.addChild(gabrielle);
        reinhold.addChild(sabine);

        //Children and spouse of Wilma
        wilma.addSpouse(new Person("Rodolfo"));

        Person ricardo = new Person("Ricardo");
        Person rodrigo = new Person("Rodrigo");

        wilma.addChild(rodrigo);
        wilma.addChild(ricardo);

        //Spouse of Ricardo
        ricardo.addSpouse(new Person("Debora"));

        // Spouse and children of Christian
        christian.addSpouse(new Person("Monica"));
        Person oscar = new Person("Oscar");
        Person lorena = new Person("Lorena");

        // Children and spouse of Sigrid
        sigrid.addSpouse(new Person("Peter"));

        Person martin = new Person("Martin");
        Person thomas = new Person("Thomas");
        Person claudia = new Person("Claudia");

        sigrid.addChild(martin);
        sigrid.addChild(thomas);
        sigrid.addChild(claudia);

        // Spouse and Children of Martin

        martin.addSpouse(new Person ("Carla"));
        martin.addChild(new Person ("Nicolas"));

        lily.printFamilyTree();
    }
}