package com.example.demo.solid.isp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/solid/isp")
public class IspController {
    private final PrintDevice printer;       // small interface
    private final ScanDevice scanner;        // separate interface

    public IspController(@Qualifier("simplePrinter") PrintDevice printer,
                         @Qualifier("mfp") ScanDevice scanner) {
        this.printer = printer; this.scanner = scanner;
    }

    @GetMapping("/print")
    public Map<String,String> print(@RequestParam(defaultValue="Hello") String doc) {
        return Map.of("result", printer.print(doc));
    }

    @GetMapping("/scan")
    public Map<String,String> scan() {
        return Map.of("result", scanner.scan());
    }
}


//        Try:
//
//        /solid/isp/print?doc=Report
//
//        /solid/isp/scan