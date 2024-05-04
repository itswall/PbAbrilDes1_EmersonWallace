package application;

import entities.Adult;
import entities.Child;
import park.FerrisWheel;

public class Main {
    public static void main(String[] args) {

        FerrisWheel ferrisWheel = new FerrisWheel();

        Adult paul = new Adult("Paulo", 54);
        Child beneres = new Child("Beneres", 7, paul);


        ferrisWheel.seat(5, beneres, paul);
        ferrisWheel.seat(4, paul);
    }
}