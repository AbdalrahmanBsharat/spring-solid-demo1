package com.example.demo.solid.srp;

import org.springframework.stereotype.Repository;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryInvoiceRepository implements InvoiceRepository {
    private final AtomicLong seq = new AtomicLong(1);
    @Override public Invoice save(Invoice invoice) {
        // pretend to persist; just ensure it has an id
        return new Invoice(seq.getAndIncrement(), invoice.getItems());
    }
}
