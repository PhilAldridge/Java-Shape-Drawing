package com.shapes.graphics;

import java.util.List;

public class SystemOut  implements Graphics{
    @Override
    public void draw(List<String> linesToDraw) {
        for(String line: linesToDraw) {
            System.out.println(line);
        }
    }
}
