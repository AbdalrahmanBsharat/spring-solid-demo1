package com.example.demo.solid.lsp;
public class Square implements Shape {
    private final int side;
    public Square(int side) { this.side = side; }
    public int area() { return side * side; }
    public String name() { return "Square(" + side + ")"; }
}
