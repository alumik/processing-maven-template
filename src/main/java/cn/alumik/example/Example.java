package cn.alumik.example;

import processing.core.*;

public class Example extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Example.class);
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
