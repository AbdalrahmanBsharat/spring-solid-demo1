package com.example.demo.solid.ocp;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CheckoutService {
    private final Map<String, DiscountPolicy> policies; // bean name → policy

    public CheckoutService(Map<String, DiscountPolicy> policies) { this.policies = policies; }

    public double pay(double amount, String policyName) {
        DiscountPolicy p = policies.getOrDefault(policyName, policies.get("noDiscount"));
        return Math.round(p.apply(amount) * 100.0) / 100.0;
    }
}
