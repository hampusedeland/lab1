import java.awt.*;

public class Saab95 extends  Car implements Movable{




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



        System.out.println(snabbisen.getCurrentdirection());
        System.out.println(snabbisen.position());

        snabbisen.move();
        snabbisen.move();


        System.out.println(snabbisen.position());

        snabbisen.move();
        snabbisen.move();
        System.out.println(snabbisen.position());

        snabbisen.turnRight();
        snabbisen.move();
        snabbisen.move();
        System.out.println(snabbisen.position());

    }

    @Override
    public void move() {
        if(getCurrentdirection().equals("north")){
           setY(getY()+getCurrentSpeed());
        }
        if(getCurrentdirection().equals("south")){
            setY(getY()-getCurrentSpeed());
        }
        if(getCurrentdirection().equals("west")){
            setX(getX()-getCurrentSpeed());
        }
        if(getCurrentdirection().equals("east")){
            setX(getX()+getCurrentSpeed());
        }

    }

    @Override
    public void turnLeft() {
        if(getCurrentdirection().equals("north")){
            setCurrentdirection("west");
        }
        if(getCurrentdirection().equals("west")){
            setCurrentdirection("south");
        }
        if(getCurrentdirection().equals("south")){
            setCurrentdirection("east");
        }
        if(getCurrentdirection().equals("east")){
            setCurrentdirection("north");
        }
    }

    @Override
    public void turnRight() {
        if(getCurrentdirection().equals("north")){
            setCurrentdirection("east");
       }
        if(getCurrentdirection().equals("east")){
            setCurrentdirection("south");
        }
        if(getCurrentdirection().equals("south")){
            setCurrentdirection("west");
        }
        if(getCurrentdirection().equals("west")){
            setCurrentdirection("north");
        }

    }



}
