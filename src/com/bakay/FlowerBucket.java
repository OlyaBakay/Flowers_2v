package com.bakay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FlowerBucket {
    private int defaultSize = 10;
    private int insertIndex = 0; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];

    public void addFlower(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            Flower tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i ++) {
            sum += a[i].getPrice();
        }
        return sum;
    }

    public Flower[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start ) {
                tmpSize ++;
            }
        }
        Flower[] tmpPart = new Flower[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start ) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex ++;
            }
        }
        return tmpPart;
    }

    public ArrayList<Flower> getFlower(FlowerSpec type){

        ArrayList<Flower> tmp = new ArrayList<Flower>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getType().equals(type)) {
                tmp.add(a[i]);
            }
        }

        return tmp;
    }

    public List search(FlowerSpec flower){
        List matchingFlowers = new LinkedList();
        for (int i=0; i < insertIndex; i++){
            if(flower.getColor() != a[i].getColor())
                continue;
            if(flower.getLength() != a[i].getLength())
                continue;
            if (flower.getType() != a[i].getType())
                continue;
            matchingFlowers.add(a[i]);
        }
        return matchingFlowers;

    }
}