package com.company;

public class Main {

    public static void main(String[] args) {

        MovableRectangle Rectangle = new MovableRectangle(new Point(1,1),new Point(2, 3));
        System.out.println(Rectangle);
        System.out.println(Rectangle.getDlin());
        Rectangle.move(12, 13);
        if(Rectangle.error==0){
            System.out.println(Rectangle);}
        System.out.println(Rectangle.getDlin());

        System.out.println("-----------------------------------------");

        MovableCircle circle = new MovableCircle(new Point(1,1), 10.876);
        System.out.println(circle);
        circle.move(12, 13);
        System.out.println(circle);

        System.out.println("-----------------------------------------");

        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);
    }
}