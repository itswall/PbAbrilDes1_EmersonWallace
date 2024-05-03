package entities;

public class Child extends Person{

    private Adult responsible;

    public Adult getResponsible() {
        return responsible;
    }

    public void setResponsible(Adult responsible) {
        this.responsible = responsible;
    }

    public Child(String name, int age, Adult responsible) {
        super(name, age);
        this.responsible = responsible;
    }

    public Child(String name, int age) {
        super(name, age);


    }
}
