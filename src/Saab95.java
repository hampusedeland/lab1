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
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
    public static void main(String args[]){
        Saab95 snabbisen = new Saab95();
        snabbisen.startEngine();
        snabbisen.setCurrentdirection("west");
        System.out.println(snabbisen.getNrDoors());


        snabbisen.move();
        snabbisen.move();
        snabbisen.move();

        System.out.println(snabbisen.getCurrentdirection());
        System.out.println(snabbisen.position());
        snabbisen.turnLeft();
        System.out.println(snabbisen.position());
        snabbisen.move();
        snabbisen.move();
        snabbisen.move();
        System.out.println(snabbisen.position());

    }

}
