package BT_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(1,2,4,5);
        movablePoint.setSpeed(5,6);
        System.out.println("Thằng con: "+Arrays.toString(movablePoint.getSpeed()));
        System.out.println("Thằng cha: "+Arrays.toString(movablePoint.getXY()));
        System.out.println("--------------------------------------");
        System.out.println(movablePoint.move());
    }
}
