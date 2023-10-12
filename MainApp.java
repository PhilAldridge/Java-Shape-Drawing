package com.shapes;

import com.shapes.graphics.SystemOut;
import com.shapes.graphics.WriteToFile;
import com.shapes.shapeClasses.*;

public class MainApp {
    public static void main(String[] args) {
        /*Shapes shapesObject = new Shapes();
        shapesObject.add(new BorderedShape(new Square(4)));
        shapesObject.add(new Square(4));
        shapesObject.draw(new SystemOut());
        shapesObject.draw(new WriteToFile());*/

        DrawBuffer drawBuffer = new DrawBuffer(100,20);
        drawBuffer.drawToBuffer(89,5,new Square(20));
        drawBuffer.drawToBuffer(20,3,new BorderedShape(new BorderedShape(new Rectangle(15,9))));
        drawBuffer.drawToBuffer(0,0, new Triangle(11,18));
        drawBuffer.drawToBuffer(6,8,new BorderedShape(new RightSlopedTriangle(6,9)));
        drawBuffer.display(new SystemOut());
        drawBuffer.display(new WriteToFile());
    }
}
