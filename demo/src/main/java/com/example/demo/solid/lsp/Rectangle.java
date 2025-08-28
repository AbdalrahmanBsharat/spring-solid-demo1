package com.example.demo.solid.lsp;
public class Rectangle implements Shape {
    private final int w, h;
    public Rectangle(int w, int h) { this.w = w; this.h = h; }
    public int area() { return w * h; }
    public String name() { return "Rectangle(" + w + "x" + h + ")"; }
}
