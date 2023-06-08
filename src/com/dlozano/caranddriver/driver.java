package com.dlozano.caranddriver;

public class driver extends car{
    public int drive (){
        this.changeGasLevel(-1);
        System.out.println("You drive the car");
        return this.getGasLevel();
    }

    public int useBooster (){
        this.changeGasLevel(-3);
        System.out.println("You used the boosters");
        return this.getGasLevel();
    }

    public int refuel (){
        this.changeGasLevel(2);
        System.out.println("You refuel the car");
        return this.getGasLevel();
    }
}
