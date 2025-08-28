package com.example.demo.solid.lsp;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/solid/lsp")
public class LspController {
    @GetMapping("/areas")
    public List<Map<String,Object>> areas() {
        List<Shape> shapes = List.of(new Rectangle(5,10), new Square(6), new Circle(3));
        List<Map<String,Object>> outt = new ArrayList<>();
        for (Shape s : shapes) outt.add(Map.of("shape", s.name(), "area", s.area()));
        return outt;
    }
}


// Try: http://localhost:8080/solid/lsp/areas