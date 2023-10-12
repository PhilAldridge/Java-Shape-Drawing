package com.shapes.shapeClasses;

import com.shapes.graphics.Graphics;

import java.util.ArrayList;
import java.util.List;

public class Square implements Shape {
    private final int size;

    public Square(int size){
        this.size = Math.max(0,size);
    }


    public void draw(Graphics g){
        List<String> toDraw = new ArrayList<>();
        for(var i=0; i<size;i++) {
            toDraw.add(lineToPrint(i));
        }
        g.draw(toDraw);
    }

    @Override
    public String lineToPrint(int lineNumber) {
        if(lineNumber>=size) return " ".repeat(size);
        return "*".repeat(size);
    }

    @Override
    public int getLength() {
        return size;
    }

    @Override
    public int getHeight() {
        return size;
    }
}
