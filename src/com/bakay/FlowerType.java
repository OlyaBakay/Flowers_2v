package com.bakay;

public enum FlowerType {
    Rose, Poppy, Chamomile, Tulip;

    public String toString() {
        switch (this){
            case Rose:
                return "Rose";
            case Poppy:
                return "Poppy";
            case Chamomile:
                return "Chamomile";
            case Tulip:
                return "Tulip";
            default:
                return "Undefined type";
        }

    }
}
