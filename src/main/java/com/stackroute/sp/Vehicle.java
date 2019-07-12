package com.stackroute.sp;

public class Vehicle {
    private String steeringValue = "straight";
    private int gear;
    private int speed;

    public String getSteeringValue() {
        return steeringValue;
    }

    public void setSteeringValue(String steeringValue) {
        this.steeringValue = steeringValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeGear(int value) {
        System.out.println("Vehicle is in "+gear+" gear");
    }
    public void handleSteering() {
        if(steeringValue == "left" || steeringValue == "right" || steeringValue == "straight" )
        System.out.println("Vehicle is moving "+steeringValue);
    }

    public void accelerate() {
        if (speed <= 80){
            speed = speed + 10;
        }else {
            System.out.println("Unable to increase more than 80km/h");
        }
        System.out.println("Current Speed of the vehicle is "+speed);
    }

    public void brake() {
        if (speed >= 0){
                speed = speed - 10;
        }else {
            System.out.println("Unable to decrease less than 0km/h");
        }
        System.out.println("Current Speed of the vehicle is "+speed);
    }


}
