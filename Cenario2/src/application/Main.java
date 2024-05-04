package application;

import entities.Adult;
import entities.Child;
import park.FerrisWheel;

public class Main {
    public static void main(String[] args) {

        FerrisWheel ferrisWheel = new FerrisWheel();// Creating a new ferris wheel

        Adult paul = new Adult("Paul", 54); // add adult paul

        //Paul's children
        Child joao = new Child("João", 5, paul); //Son of paul
        Child maria = new Child("Maria", 12, paul);// Daughter of paul

        //Children without responsible
        Child pedro = new Child("Pedro", 13);
        Child henrique = new Child("Henrique", 10);


        try{
        ferrisWheel.seat(2, joao, maria);
        ferrisWheel.seat(2, joao, paul);
        ferrisWheel.seat(3, maria);
        ferrisWheel.seat(13, pedro);
        ferrisWheel.seat(16, henrique);
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException("This gondola does not exist");
        }
        finally {
            ferrisWheel.status();
        }
    }
}