import java.awt.*;

/**
 * Representerar en Volvo, som är en Car(bil) och implementerar interfacet
 */
public class Volvo240 extends Car implements Movable{

    public final static double trimFactor = 1.25;


    /**
     * Default Konstruktor, som anropar Car, Och "bygger en default Volvo
     * @param
     */
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }



    /**
     * Beskriver hur farten påverkan av "trimfactor"
     */
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }
    /**
     * metoden anropas av Gas senare, och uppdaterar hastigheten.
     *Ser till så att hastigheten är realistiskt
     */
    public void incrementSpeed(double amount){
        if(getCurrentSpeed()>=0 && getCurrentSpeed()+ amount<=getEnginePower()) {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
        }
    }
    /**
     * används för att uppdatera hastigheten vid en minskning, anropas av Break
     */

    public void decrementSpeed(double amount){
        if(getCurrentSpeed() - amount >=0 && getCurrentSpeed() <=getEnginePower()) {
            currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
        }
    }

    /**
     * Tar en amount mellan 0-1
     */
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
    /**
     * Default Konstruktor, som anropar Car, Och "bygger en default Volvo
     * @param
     */
    public static void main(String args[]){
        Volvo240 volvon = new Volvo240();
        volvon.startEngine();
        volvon.setCurrentdirection("west");
        System.out.println(volvon.getNrDoors());
        for(int i= 0 ; i<=200 ; i++) {
            volvon.gas(0.9);
        }
        System.out.println(volvon.getCurrentSpeed());
        for(int i= 0 ; i<=200 ; i++) {
            volvon.brake(0.9);
        }
        System.out.println(volvon.getCurrentSpeed());

    }





}
