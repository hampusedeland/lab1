import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn;
    // public String modelName; modelname in car

    public Saab95(Integer nrDoors, Color color, double enginePower){ //ett problem va att man behövde deklarera flera ggr för resp konstruktor
        super(nrDoors, color, enginePower);
        turboOn = false;
        modelName = "Saab95";
    }


    private void setTurboOn(){
        turboOn = true;
    }

    private void setTurboOff(){
        turboOn = false;
    }

    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    private void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){ incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){ decrementSpeed(amount);
    }
}
