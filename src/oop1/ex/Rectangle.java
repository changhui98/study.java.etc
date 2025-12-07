package oop1.ex;

public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculatePerimeter() {

        return 2 * (width + height);
    }

    public int calculateArea() {

        return width * height;
    }

    public boolean isSquare() {

        return width == height;
    }
}
