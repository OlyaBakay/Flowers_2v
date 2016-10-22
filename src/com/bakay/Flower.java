package com.bakay;

public class Flower {


    protected boolean fresh;
    protected double price;
    protected FlowerSpec spec;

    public Flower(FlowerColor color, double length, boolean fresh, double price, FlowerType type) {
        this.fresh = fresh;
        this.price = price;
        this.spec = new FlowerSpec(color, type, length);
    }

    public FlowerType getType() {
        return spec.getType();
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return spec.length;
    }

    public FlowerColor getColor() {
        return spec.color;
    }

    public boolean isFresh() {
        return fresh;
    }

    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh level is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }

}
