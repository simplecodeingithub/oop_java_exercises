package com.techreturners.cats;

public class CheetahCat extends AbstractCat{
    public boolean isAsleep() {
        return false;
    }
    @Override
    public void goToSleep() {
    }
    @Override
    public void wakeUp() {
    }
    @Override
    public String getSetting() {
        return null;
    }
    @Override
    public double getAverageHeight() {
        return 0;
    }
    @Override
    public String eat() {
        return makeSound();
    }
    public String makeSound() {
        return String.format("%s","Zzzzzzz");
    }
}
