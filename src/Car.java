import java.awt.*;
//val av superclass
public class Car implements Movable {
    //lämplig intern representation av deras riktning och position
    //
    private double positionX;
    private double positionY;
    private String direction;



    //variabler
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName;
    protected double currentSpeed;


    protected Car (Integer nrDoors, Color color, double enginePower) {
        this.nrDoors = nrDoors ;
        this.color = color;
        this.enginePower = enginePower;
        positionX= 0;//börja på origo
        positionY=0;



        stopEngine();
    }
    //variablerna kan vara protekted iom att vi har funktioner som retunerar deras värde (getters och setters)
    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }


    @Override
    public void move() {
        if (direction == "RIGHT"){
            positionX += currentSpeed;
        };
        if (direction == "UP"){
            positionY+= currentSpeed;
        }
        if (direction == "LEFT"){
            positionX-= currentSpeed;
        }
        if (direction == "DOWN"){
            positionY-= currentSpeed;
        }
    }

    @Override
    public void turnLeft() {
        if (direction == "RIGHT") {
            direction = "UP";
        }
        else if (direction == "UP"){
            direction = "LEFT";
        }
        else if (direction == "LEFT"){
            direction = "DOWN";
        }
        else {
            direction = "RIGHT";
        }

    }

    @Override
    public void turnRight() {
        if (direction == "RIGHT") {
            direction = "DOWN";
        }
        else if (direction == "UP"){
            direction = "RIGHT";
        }
        else if (direction == "LEFT"){
            direction = "UP";
        }
        else {
            direction = "LEFT";
        }

    }
}

