package com.example.demo.solid.isp;
import org.springframework.stereotype.Component;

@Component("mfp")
public class MultiFunctionMachine implements PrintDevice, ScanDevice {
    public String print(String doc) { return "MFP printed: " + doc; }
    public String scan() { return "MFP scanned document"; }
}
