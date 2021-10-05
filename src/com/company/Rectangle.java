package com.company;

public class  Rectangle {
    private Point right;
    private Point left;

    public Rectangle(Point right, Point left) {
        this.right = right;
        this.left = left;
    }

    public Point getRight() {
        return right;
    }

    public void setRight(Point right) {
        this.right = right;
    }

    public Point getLeft() {
        return left;
    }

    public void setLeft(Point left) {
        this.left = left;
    }
    public double getDlin(){
        return  Math.sqrt(((right.getX()- left.getX())*(right.getX()- left.getX()))+((right.getY()- left.getY())*(right.getY()- left.getY())));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "right=" + right +
                ", left=" + left +
                '}';
    }
}
