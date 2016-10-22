package com.bakay;

public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(FlowerColor.Green, 12, true, 12.5, FlowerType.Poppy);
        Flower romashka = new Flower(FlowerColor.White, 12, true, 12.5, FlowerType.Chamomile);
        Flower tulip = new Flower(FlowerColor.Red, 11, false, 12.5, FlowerType.Tulip);
        Flower rose = new Flower(FlowerColor.Pink, 10, true, 13.5, FlowerType.Rose);
        Flower tulip1 = new Flower(FlowerColor.Yellow, 10, true, 13.5, FlowerType.Tulip);


        FlowerSpec findFlower1 = new FlowerSpec(FlowerColor.Green, FlowerType.Poppy, 12);
        FlowerSpec findFlower2 = new FlowerSpec(FlowerColor.Yellow, FlowerType.Tulip, 12);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);
        bucket.addFlower(tulip);
        bucket.addFlower(rose);
        bucket.addFlower(tulip1);


        System.out.println(bucket.getFlower(findFlower2));
        System.out.println(bucket.search(findFlower1));

    }
}

