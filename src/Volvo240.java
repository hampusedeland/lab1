import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25; //frågar aldrig ngt om det


    public Volvo240(Integer nrDoors, Color color, double enginePower){
        super(nrDoors, color, enginePower);
        modelName = "Volvo240";
        stopEngine();
    }


    private double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    } //speed faktor only used localy ==private

    private void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){ incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){ decrementSpeed(amount);
    }
}
