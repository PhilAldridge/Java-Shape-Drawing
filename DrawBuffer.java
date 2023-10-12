package com.shapes;

import com.shapes.graphics.Graphics;
import com.shapes.shapeClasses.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawBuffer {
    private final String[] buffer;
    private final int windowHeight, windowLength;
    public DrawBuffer(int windowLength, int windowHeight){
        buffer = new String[windowHeight];
        Arrays.fill(buffer, " ".repeat(windowLength));
        this.windowHeight=windowHeight;
        this.windowLength=windowLength;
    }
    public void drawToBuffer(int startX, int startY, Shape shapeToDraw){
        int height = shapeToDraw.getHeight();
        for(int i=0;i<Math.min(height, windowHeight-startY);i++){
            bufferOneLine(startX, startY+i, shapeToDraw, i);
        }
    }

    private void bufferOneLine(int startX, int linePosition, Shape shapeToDraw, int linePositionOfShape) {

        StringBuilder replacementLine = new StringBuilder(buffer[linePosition].substring(0, startX));

        replacementLine.append(shapeToDraw.lineToPrint(linePositionOfShape));

        removeExtraCharacters(replacementLine);
        addNonOverwrittenCharacters(linePosition, replacementLine);

        buffer[linePosition] = replacementLine.toString();
    }

    private void addNonOverwrittenCharacters(int linePosition, StringBuilder replacementLine) {
        if(replacementLine.length()<windowLength){
            replacementLine.append(buffer[linePosition].substring(replacementLine.length()));
        }
    }

    private void removeExtraCharacters(StringBuilder replacementLine) {
        while(replacementLine.length()>windowLength){
            replacementLine.deleteCharAt(replacementLine.length()-1);
        }
    }

    public void display(Graphics g) {
        List<String> toDisplay = new ArrayList<>();

        toDisplay.add("┌"+"─".repeat(windowLength)+"┐");

        for(String line: buffer){
            toDisplay.add("│"+line+"│");
        }

        toDisplay.add("└"+"─".repeat(windowLength)+"┘");
        g.draw(toDisplay);
    }
}
