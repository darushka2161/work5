package com.company;

public class MovableRectangle extends Rectangle implements Movable {
    public int error = 0;
    public MovableRectangle(Point right, Point left) {
        super(right, left);
    }

    @Override
    public void move(int x, int y) {
        int x1=x;
        x1= 1 + (int) (Math.random() * 20);
        double comp= Math.sqrt((((getRight().getX()+x1)-(getLeft().getX()+x))*((getRight().getX()+x)- (getLeft().getX()+x)))+(((getRight().getY()+y)- (getLeft().getY()+y))*((getRight().getY()+y)- (getLeft().getY()+y))));
        if (getDlin() != comp)
        {
            System.out.println("Error wrong moving!");
            error=1;
        }
        else
        {
            getRight().setX(getRight().getX()+x1);
            getRight().setY(getRight().getY()+y);
            getLeft().setX(getLeft().getX()+x);
            getLeft().setY(getLeft().getY()+y);
        }
    }
}
