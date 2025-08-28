package com.example.demo.solid.ocp;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/solid/ocp")
public class OcpController {
    private final CheckoutService checkout;
    public OcpController(CheckoutService checkout) { this.checkout = checkout; }

    @GetMapping("/pay")
    public Map<String,Object> pay(@RequestParam double amount,
                                  @RequestParam(defaultValue="noDiscount") String policy) {
        return Map.of("amount", amount, "policy", policy, "toPay", checkout.pay(amount, policy));
    }
}



//Try:
//
//        /solid/ocp/pay?amount=100
//
//        /solid/ocp/pay?amount=100&policy=seasonal
//
//        /solid/ocp/pay?amount=100&policy=loyalty
//
//        (Add a new policy class later—no service change needed.)