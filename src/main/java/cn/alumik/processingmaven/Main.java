package cn.alumik.processingmaven;

import processing.core.*;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
        surface.setTitle("Example");
    }

    @Override
    public void draw() {
        background(51);
    }
}
