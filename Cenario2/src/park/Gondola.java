package park;

import entities.Person;

public class Gondola {
    private int num;
    private Person seatX;
    private Person seatY;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Person getSeatX() {
        return seatX;
    }

    public void setSeatX(Person seatX) {
        this.seatX = seatX;
    }

    public Person getSeatY() {
        return seatY;
    }

    public void setSeatY(Person seatY) {
        this.seatY = seatY;
    }
}
