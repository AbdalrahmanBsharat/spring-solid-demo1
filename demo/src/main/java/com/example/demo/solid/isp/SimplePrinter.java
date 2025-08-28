package com.example.demo.solid.isp;
import org.springframework.stereotype.Component;

@Component("simplePrinter")
public class SimplePrinter implements PrintDevice {
    public String print(String doc) { return "Printed: " + doc; }
}
