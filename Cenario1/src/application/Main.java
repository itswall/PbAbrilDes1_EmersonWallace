package application;


import entities.Person;

public class Main {
    public static void main(String[] args) {
        Person lily = new Person("Lily");
        lily.addSpouse(new Person("Wilhelm"));
        // Patriarch and matriarch
        Person opa = new Person("Opa");
        opa.addSpouse(new Person("Oma"));
        // Children of Oma and Opa
        Person reinhold = new Person("Reinhold");
        Person wilma = new Person("Wilma");
        Person sigrid = new Person("Sigrid");
        // Children and spouse of Reinhold
        reinhold.addSpouse(new Person("Sonia"));
        Person christian = new Person("Christian");
        Person gabrielle = new Person("Gabrielle");
        Person sabine = new Person("Sabine");
        // Children and spouse of Wilma
        wilma.addSpouse(new Person("Rodolfo"));
        Person ricardo = new Person("Ricardo");
        Person rodrigo = new Person("Rodrigo");
        // Ricardo and spouse
        ricardo.addSpouse(new Person("Debora"));
        // Children and spouse of Christian
        christian.addSpouse(new Person("Monica"));
        Person oscar = new Person("Oscar");
        Person lorena = new Person("Lorena");
        // Children and spouse of Sigrid
        sigrid.addSpouse(new Person("Peter"));
        Person martin = new Person("Martin");
        Person thomas = new Person("Thomas");
        Person claudia = new Person("Claudia");
        martin.addSpouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));
        lily.printFamilyTree();
    }
}