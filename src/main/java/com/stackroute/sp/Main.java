package com.stackroute.sp;

public class Main {
    public static void main(String args[])
    {
       HondaCity hondaCity = new HondaCity();
       hondaCity.accelerate();
       hondaCity.accelerate();
       hondaCity.changeGear(2);
       hondaCity.handleSteering();
       hondaCity.setSteeringValue("left");
       hondaCity.handleSteering();
       hondaCity.brake();
    }
}
