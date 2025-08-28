package com.example.demo.solid.lsp;
public class Circle implements Shape {
    private final int r;
    public Circle(int r) { this.r = r; }
    public int area() { return (int) Math.round(Math.PI * r * r); }
    public String name() { return "Circle(r=" + r + ")"; }
}
