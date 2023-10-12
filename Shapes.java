package com.shapes;

import com.shapes.graphics.Graphics;
import com.shapes.shapeClasses.Shape;

import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        this.shapes.add(shape);
    }
    public void draw(Graphics g){
        for (Shape shape : shapes) {
            shape.draw(g);


            System.out.println();
        }
    }

    public ArrayList<Shape> getShapes(){
        return this.shapes;
    }

    public void addFromShapes(Shapes shapesToMerge) {
        ArrayList<Shape> newShapes = shapesToMerge.getShapes();
        shapes.addAll(newShapes);
    }
}
