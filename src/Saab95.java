import java.awt.*;

public class Saab95 extends  Car {




    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();


    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        if(getCurrentSpeed()>=0 && getCurrentSpeed()+ amount<=getEnginePower()) {
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        }
    }

    public void decrementSpeed(double amount){
        if(getCurrentSpeed() - amount >=0 && getCurrentSpeed() <=getEnginePower()) {
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        }
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        if(amount<=1 && amount>=0){
                incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if(amount<=1 && amount>=0) {
                decrementSpeed(amount);
        }
    }
    public static void main(String args[]){
        Saab95 snabbisen = new Saab95();
        snabbisen.startEngine();
        snabbisen.setCurrentdirection("west");
        System.out.println(snabbisen.getNrDoors());
        System.out.println(snabbisen.getCurrentSpeed());
        snabbisen.gas(0.9);
        System.out.println(snabbisen.getCurrentSpeed());
        snabbisen.brake(0.9);
        System.out.println(snabbisen.getCurrentSpeed());


    }

}
