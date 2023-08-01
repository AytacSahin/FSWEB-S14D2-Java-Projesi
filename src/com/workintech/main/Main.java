package com.workintech.main;

import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        A_Bedroom myhouse = new A_Bedroom(
                "My Room",
                new Wall("North"),
                new Wall("West"),
                new Wall("East"),
                new Wall("South"),
                new Ceiling(50, PaintColor.BLUE),
                new Bed("Soft", 5, 30, 2, 2),
                new Lamp(LampType.WALL_LAMP, true, 50),
                new Wardrobe(80, 90, 28.6),
                new Carpet(49, 49, PaintColor.WHITE));
        System.out.println("[1] What is bedroom name:" );
        System.out.println(myhouse.getName());
        System.out.println("[2] What are the directions of walls ?");
        System.out.println("[2-a] Wall1 Direction: " + myhouse.getWall1().getDirection());
        System.out.println("[2-b] Wall2 Direction: " + myhouse.getWall2().getDirection());
        System.out.println("[2-c] Wall3 Direction: " + myhouse.getWall3().getDirection());
        System.out.println("[2-d] Wall4 Direction: " + myhouse.getWall4().getDirection());

        System.out.println("[3] What are properties of ceiling:" );
        System.out.println("[3-a] Ceiling Height: " + myhouse.getCeiling().getHeight());
        System.out.println("[3-b] Ceiling Color: " + myhouse.getCeiling().getPaintedColor());

        System.out.println("[4] What are properties of bed:" );
        myhouse.getBed().make();
        System.out.println("[4-a] Number of Pillows: " + myhouse.getBed().getPillows());
        System.out.println("[4-b] Bed Height: " + myhouse.getBed().getHeight());
        System.out.println("[4-c] Number of Sheets: " + myhouse.getBed().getSheets());
        System.out.println("[4-d] Number of Quilts: " + myhouse.getBed().getQuilt());

        System.out.println("[5] What are properties of lamp:" );
        myhouse.getLamp().turnOn();
        System.out.println("[5-a] Lamp Style: " + myhouse.getLamp().getStyle());
        System.out.println("[5-b] Is Lamp Battery Operated?: " + myhouse.getLamp().isBattery());
        System.out.println("[5-c] Lamp Global Rating: " + myhouse.getLamp().getGlobRating());

        System.out.println("[6] What are properties of Wardrobe:" );
        myhouse.getWardrobe().add();
        System.out.println("[6-a] Wardrobe Width: " + myhouse.getWardrobe().getWidth());
        System.out.println("[6-b] Wardrobe Height: " + myhouse.getWardrobe().getHeight());
        System.out.println("[6-c] Wardrobe Weight: " + myhouse.getWardrobe().getWeight());

        System.out.println("[7] What are properties of Carpet:" );
        myhouse.getCarpet().lying();
        System.out.println("[7-a] Carpet Width: " + myhouse.getCarpet().getWidth());
        System.out.println("[7-b] Carpet Height: " + myhouse.getCarpet().getHeight());
        System.out.println("[7-c] Carpet Color: " + myhouse.getCarpet().getColor());
    }

}