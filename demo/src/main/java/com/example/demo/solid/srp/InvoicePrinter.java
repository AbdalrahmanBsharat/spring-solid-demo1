package com.example.demo.solid.srp;
import org.springframework.stereotype.Service;
@Service
public class InvoicePrinter {
    public String print(Invoice invoice,double total){
        StringBuilder sb=new StringBuilder("invoice #"+invoice.getId()+"/n");
        invoice.getItems().forEach(i -> sb.append("-").append(i.getName()).append(": ").append(i.getPrice()).append("\n"));
        sb.append("TOTAL = ").append(total);
        return sb.toString();
    }
}
