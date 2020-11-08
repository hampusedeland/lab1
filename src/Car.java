import java.awt.*;

public class Car {
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


    public double getX0() {
        return x0;
    }
    public String position(){
       return currentpos = "["+ getX() + " " + getY() + "]" + " Facing:" + getCurrentdirection() ;
    }

    public double getY0() {
        return y0;
    }

    public void startPos(int x0, int y0) { }

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



    public Car(){}

}
