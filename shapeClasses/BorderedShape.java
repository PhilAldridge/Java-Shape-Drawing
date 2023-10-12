package com.shapes.shapeClasses;

import com.shapes.graphics.Graphics;

import java.util.ArrayList;
import java.util.List;

public class BorderedShape implements Shape {
    private final int length, height;
    private final Shape shapeToDraw;

    public BorderedShape(Shape shapeToDraw){
        this.length = shapeToDraw.getLength() + 4;
        this.height = shapeToDraw.getHeight() + 4;
        this.shapeToDraw = shapeToDraw;
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
        if(lineNumber==0 || lineNumber==height-1) return "+".repeat(length);
        if(lineNumber==1 || lineNumber==height-2) return  "+"+" ".repeat(length-2)+"+";
        return "+ "+shapeToDraw.lineToPrint(lineNumber-2)+" +";
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
