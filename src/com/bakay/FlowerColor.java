package com.bakay;

public enum FlowerColor {

    Red, Green, Pink, White, Yellow;

    public String toString() {
        switch (this) {
            case Red:
                return "Red";
            case Green:
                return "Green";
            case Pink:
                return "Pink";
            case White:
                return "White";
            case Yellow:
                return "Yellow";
            default:
                return "No color";
        }
    }
}