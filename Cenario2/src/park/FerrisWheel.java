package park;

import entities.Adult;
import entities.Child;

public class FerrisWheel {

    Gondola[] seat = new Gondola[18];

    // method for alone adult
    public void seat(int seatNum, Adult personX) {

        if (seat[seatNum - 1] != null) { // test if the seat is occupied
            if (seat[seatNum - 1].getSeatY() == null) { // test if the seat 2 is occupied
                seat[seatNum - 1].setSeatY(personX); // add person in seat 2
            } else { // if both are occupied, find an empty seat and add person in seat 1 or 2
                for (int i = 0; i < seat.length; i++) {
                    if (seat[i] == null) {
                        seat[i] = new Gondola();
                        seat[i].setNum(seatNum);
                        seat[i].setSeatY(personX);
                    } else if (seat[i].getSeatY() == null) {
                        seat[i].setNum(seatNum);
                        seat[i].setSeatY(personX);
                    }
                }
            }
        } else { // if not occupied add in seat 1
            seat[seatNum - 1] = new Gondola();
            seat[seatNum - 1].setNum(seatNum);
            seat[seatNum - 1].setSeatX(personX);
        }
    }

    //method for alone child
    public void seat(int seatNum, Child personX) {

        if (personX.getAge() < 12) { // test if the child is under 12
            seat[seatNum - 1] = null; // set null if is under 12
        } else if (seat[seatNum - 1] != null) { // test if the seat is occupied
            if (seat[seatNum - 1].getSeatY() == null) { // test if the seat 2 is occupied
                seat[seatNum - 1].setSeatY(personX); // add person in seat 2
            } else { // if both are occupied, find an empty seat and add person in seat 1 or 2
                for (int i = 0; i < seat.length; i++) {
                    if (seat[i] == null) {
                        seat[i] = new Gondola();
                        seat[i].setNum(seatNum);
                        seat[i].setSeatX(personX);
                    } else if (seat[i].getSeatY() == null) {
                        seat[i].setNum(seatNum);
                        seat[i].setSeatY(personX);
                    }
                }
            }
        } else { // if not occupied add in seat 1
            seat[seatNum - 1] = new Gondola();
            seat[seatNum - 1].setNum(seatNum);
            seat[seatNum - 1].setSeatX(personX);
        }
    }

    //method for a child and responsible
    public void seat(int seatNum, Child personX, Adult personY) {
        if (personX.getResponsible().equals(personY)){ // test if the responsible is the true responsible for the child
            if(seat[seatNum-1] != null){ // test if the seat is occupied
                for(int i = 0; i<seat.length; i++){
                    if(seat[i] == null){ // find an gondola with 2 seat free
                        seat[i] = new Gondola();
                        seat[i].setNum(seatNum);
                        seat[i].setSeatX(personX);
                        seat[i].setSeatY(personY);
                    }
                }
            }
            else{ // if not occupied add both
                seat[seatNum - 1] = new Gondola();
                seat[seatNum - 1].setNum(seatNum);
                seat[seatNum - 1].setSeatX(personX);
                seat[seatNum - 1].setSeatY(personY);

            }
        } else{ // if the responsible is not the same, set null
            seat[seatNum - 1] = null;
        }
    }

    //method for two children
    public void seat(int seatNum, Child personX, Child personY) {
        if (personX.getAge() < 12 || personY.getAge() < 12){ // test if the two children are under 12
            seat[seatNum - 1] = null; // set null if is under 12
        }
        else if(seat[seatNum - 1] != null){ // test if the seat is occupied
            for(int i = 0; i<seat.length; i++){
                if(seat[i] == null){ // find an gondola with 2 seat free
                    seat[i] = new Gondola();
                    seat[i].setNum(seatNum);
                    seat[i].setSeatX(personX);
                    seat[i].setSeatY(personY);
                }
            }
        }
        else{ // // if not occupied add both
            seat[seatNum - 1] = new Gondola();
            seat[seatNum - 1].setNum(seatNum);
            seat[seatNum - 1].setSeatX(personX);
            seat[seatNum - 1].setSeatY(personY);
        }
    }

    public void status() {
        System.out.println("------------ Ferris Wheel Status ------------");

        for(int i = 0; i < seat.length; i++) {
            if (seat[i] == null) {
                System.out.println("Gondola " + (i + 1) + ": " + " is empty");
            } else {
                if (seat[i].getSeatX() == null && seat[i].getSeatY() == null) {
                    System.out.println("Gondola " + (i + 1) + ": " + " is empty");
                } else if (seat[i].getSeatY() == null) {
                    System.out.println("Gondola " + (i + 1) + ": " + seat[i].getSeatX().getName() + " is alone :(");
                } else {
                    System.out.println("Gondola " + (i + 1) + ": " + seat[i].getSeatX().getName() + " And " + seat[i].getSeatY().getName());
                }
            }
        }
    }
}
