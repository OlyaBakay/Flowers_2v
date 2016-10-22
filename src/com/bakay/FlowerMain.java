package com.bakay;

public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(FlowerColor.Green, 12, true, 12.5, FlowerType.Poppy);
        Flower romashka = new Flower(FlowerColor.White, 12, true, 12.5, FlowerType.Chamomile);

        FlowerSpec findFlower = new FlowerSpec(FlowerColor.Green, FlowerType.Poppy, 12);
        FlowerSpec findFlower2 = new FlowerSpec(FlowerColor.Green, FlowerType.Chamomile, 12);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);




        System.out.println(bucket.getFlower(findFlower2));
        System.out.println(bucket.search(findFlower));

    }
}

