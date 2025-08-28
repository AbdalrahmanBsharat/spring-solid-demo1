package com.example.demo.solid.srp;
import org.springframework.stereotype.Service;
@Service

public class InvoiceCalculator {
    public double total(Invoice invoice){
        return invoice.getItems().stream().mapToDouble(Item::getPrice).sum();
    }
}
