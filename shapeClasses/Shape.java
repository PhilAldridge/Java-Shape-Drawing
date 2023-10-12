package com.shapes.shapeClasses;

import com.shapes.graphics.Graphics;

public interface Shape{
    public void draw(Graphics g);

    public String lineToPrint(int lineNumber);

    public int getLength();

    public int getHeight();
}
