package com.shapes.graphics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile implements Graphics{


    @Override
    public void draw(List<String> linesToDraw) {
        File file = new File("drawing.txt");
        file.delete();
        File newFile = new File("drawing.txt");

        try {
            newFile.createNewFile();
            FileWriter writer = new FileWriter(newFile,false);
            for(String line: linesToDraw) {
                writer.write(line + System.getProperty("line.separator"));
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
