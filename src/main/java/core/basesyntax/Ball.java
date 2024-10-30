package basesyntax;

public class Ball {

    String color;
    int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball color is " + color + ", number is " + number;
    }
}