package com.techreturners.cats;

public class LionCat extends AbstractCat{
    private double averageHeight;
    private String setting;


    public LionCat(double averageHeight,String setting) {
        this.averageHeight = averageHeight;
        this.setting=setting;
    }

    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public void goToSleep() {
        //Implementation to put the LionCat to sleep
    }

    @Override
    public void wakeUp() {
        //Implementation to wakeup the Lioncat
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public double getAverageHeight() {
        return averageHeight;
    }
    public String eat(){
        return makeSound();
    }
    public String makeSound() {
        return String.format("%s","Roar!!!!");
    }
}


