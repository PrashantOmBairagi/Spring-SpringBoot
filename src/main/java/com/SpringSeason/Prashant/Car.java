package com.SpringSeason.Prashant;

public class Car {

    Engine engine1;
    public void setEngine1(Engine engine1){
        this.engine1 = engine1;
    };
    public Engine getEngine1(){
        return engine1;
    }

    public void CarStart(){

        //Car has Dependency here on Engine
        // We can use DI (Dependency injection) Of spring using Context and Beans
//        Engine engine1 = new Engine();
          engine1.engineStart();


        System.out.println("Car Started...");

    }
}
