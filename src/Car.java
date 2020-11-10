import java.awt.*;

public class Car implements Movable {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected boolean turboOn;
    protected double x0 = 0;
    protected double y0 = 0;
    public double x=x0;
    public double y=y0;
    public String currentdirection;
    public String currentpos;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getCurrentdirection() {
        return currentdirection;
    }

    public void setCurrentdirection(String currentdirection) {
        this.currentdirection = currentdirection;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void setTurboOn(){
        turboOn = true;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public String position(){
        return currentpos = "["+ getX() + " " + getY() + "]" + " Facing:" + getCurrentdirection() ;
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
        else if(getCurrentdirection().equals("west")){
            setCurrentdirection("south");
        }
        else if(getCurrentdirection().equals("south")){
            setCurrentdirection("east");
        }
        else if(getCurrentdirection().equals("east")){
            setCurrentdirection("north");
        }
    }

    @Override
    public void turnRight() {
        if(getCurrentdirection().equals("north")){
            setCurrentdirection("east");
        }
        else if(getCurrentdirection().equals("east")){
            setCurrentdirection("south");
        }
        else if(getCurrentdirection().equals("south")){
            setCurrentdirection("west");
        }
        else if(getCurrentdirection().equals("west")){
            setCurrentdirection("north");
        }

    }



    public Car(){}

}
