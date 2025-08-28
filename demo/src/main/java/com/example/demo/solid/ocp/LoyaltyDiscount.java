package com.example.demo.solid.ocp;
import org.springframework.stereotype.Component;

@Component("loyalty")
public class LoyaltyDiscount implements DiscountPolicy {
    public double apply(double amount) { return amount * 0.85; } // -15%
}
