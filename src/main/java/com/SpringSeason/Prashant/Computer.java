package com.SpringSeason.Prashant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer{
    @Autowired //Using Constructor Injection
    Ram ram;

    // @Autowired //Using Setter Injection
    public void setRam(Ram ram) {
        this.ram = ram;
        System.out.println("using SetterMethod");
    }

    public void computerStart(){

        ram.startRam();
        System.out.println("Computer Started...");
    }
}
