package riki.com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/Hello")
    public String helloword() {
        return "customerController";

    }
}

