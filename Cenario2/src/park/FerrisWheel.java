package park;

import entities.Adult;

public class FerrisWheel {

    Gondola[] seat = new Gondola[18];

    // method for alone adult
    public void seat(int seatNum, Adult person){

        if(seat[seatNum-1] != null){
            if(seat[seatNum - 1].getSeatY() == null){
                seat[seatNum-1].setSeatY(person);
            }
            else{
                for(int i=0; i<seat.length; i++){
                    if(seat[i] == null){
                        seat[i] = new Gondola();
                        seat[i].setNum(seatNum);
                        seat[i].setSeatY(person);
                    }
                    else if(seat[i].getSeatY() == null){
                        seat[i].setNum(seatNum);
                        seat[i].setSeatY(person);
                    }
                }
            }
        }
        else{
            seat[seatNum-1] = new Gondola();
            seat[seatNum-1].setNum(seatNum);
            seat[seatNum-1].setSeatY(person);
        }
    }
}
