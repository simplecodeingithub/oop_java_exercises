package com.techreturners.cats;

public class DomesticCat extends AbstractCat{
    private  boolean asleep=false;
    private String setting="domestic";
    private int averageHeight=23;

    @Override
    public boolean isAsleep() {
        return asleep;
    }

    @Override
    public void goToSleep() {
        this.asleep=true;
    }

    @Override
    public void wakeUp() {
        this.asleep=false;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public double getAverageHeight() {
        return averageHeight;
    }

    @Override
    public String eat() {
        return makeSound();
    }
    @Override
    public String makeSound() {
        return String.format("%s","Purrrrrrr");
    }
}


