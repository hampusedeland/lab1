import java.awt.*;

public class Volvo240 extends Car implements Movable{

    public final static double trimFactor = 1.25;


    
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }
    


    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if(amount<=1 && amount>=0){
            if(amount>=getCurrentSpeed()) {
                incrementSpeed(amount);
            }
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if(amount<=1 && amount>=0) {
            if(amount<=getCurrentSpeed()) {
                decrementSpeed(amount);
            }
        }
    }

    @Override
    public void move() {

    }

    @Override
    public void turnLeft() {

    }


    @Override
    public void turnRight() {

    }



}
