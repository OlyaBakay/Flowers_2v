package com.bakay;

public class FlowerSpec {
    protected FlowerColor color;
    protected FlowerType type;
    protected double length;

    public FlowerSpec(FlowerColor color, FlowerType type, double length){
        this.color = color;
        this.type = type;
        this.length = length;
        }

    public FlowerType getType() {
        return type;
        }
    public double getLength() {
        return length;
        }
    public FlowerColor getColor(){
        return color;
        }
}