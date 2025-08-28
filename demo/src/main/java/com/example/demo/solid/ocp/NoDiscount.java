package com.example.demo.solid.ocp;
import org.springframework.stereotype.Component;

@Component("noDiscount")
public class NoDiscount implements DiscountPolicy {
    public double apply(double amount) { return amount; }
}
