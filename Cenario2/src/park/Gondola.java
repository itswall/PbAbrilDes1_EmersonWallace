package park;

import entities.Person;

public class Gondola {
    private int num;
    private Person seat1;
    private Person seat2;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Person getSeat1() {
        return seat1;
    }

    public void setSeat1(Person seat1) {
        this.seat1 = seat1;
    }

    public Person getSeat2() {
        return seat2;
    }

    public void setSeat2(Person seat2) {
        this.seat2 = seat2;
    }
}
