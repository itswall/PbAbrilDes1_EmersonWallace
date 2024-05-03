package application;

import entities.Adult;
import park.FerrisWheel;

public class Main {
    public static void main(String[] args) {

        FerrisWheel ferrisWheel = new FerrisWheel();

        Adult paul = new Adult("Paulo", 54);

        ferrisWheel.seat(4, paul);
    }
}