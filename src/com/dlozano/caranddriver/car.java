package com.dlozano.caranddriver;

public class car {
    private int gas;

    public car (){
        this.gas = 10;
    }

    public int getGasLevel(){
        return this.gas;
    }
    protected int changeGasLevel(int change){
        this.gas += change;
        return this.gas;
    }
}
