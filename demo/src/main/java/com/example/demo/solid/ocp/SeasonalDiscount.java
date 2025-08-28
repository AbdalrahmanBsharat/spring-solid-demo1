package com.example.demo.solid.ocp;
import org.springframework.stereotype.Component;

@Component("seasonal")
public class SeasonalDiscount implements DiscountPolicy {
    public double apply(double amount) { return amount * 0.90; } // -10%
}
