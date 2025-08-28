package com.example.demo.solid.srp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/solid/srp")
public class SrpController {
    private final InvoiceCalculator calc;
    private final InvoicePrinter printer;
    private final InvoiceRepository repo;

    public SrpController(InvoiceCalculator calc, InvoicePrinter printer, InvoiceRepository repo) {
        this.calc = calc;
        this.printer = printer;
        this.repo = repo;
    }

    @GetMapping("/demo")
    public Map<String, Object> demo() {
        Invoice tmp = new Invoice(0, List.of(
                new Item("Book", 30.0),
                new Item("Pen", 5.5)
        ));
        Invoice saved = repo.save(tmp);
        double total = calc.total(saved);
        String text = printer.print(saved, total);
        return Map.of("id", saved.getId(), "total", total, "printed", text);
    }
}


// Run & see: http://localhost:8080/solid/srp/demo