package com.shapes.shapeClasses;

import com.shapes.graphics.Graphics;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape {
    private final int length, height;

    public Rectangle(int length, int height) {

        this.length = Math.max(0, length);
        this.height = Math.max(0, height);
    }

    public void draw(Graphics g){
        List<String> toDraw = new ArrayList<>();
        for(var i=0; i<height;i++) {
            toDraw.add(lineToPrint(i));
        }
        g.draw(toDraw);
    }

    @Override
    public String lineToPrint(int lineNumber) {
        return "*".repeat(length);
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
