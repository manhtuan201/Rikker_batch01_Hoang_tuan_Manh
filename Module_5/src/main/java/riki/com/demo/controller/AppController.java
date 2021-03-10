package riki.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import riki.com.demo.Model.Userproduct;
import riki.com.demo.service.ProductService;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private ProductService service;
    @GetMapping("/")
    public  String viewHomePage(Model model){
        List<Userproduct> listProducts = service.listAll();
        model.addAttribute("listProducts",listProducts);
        return "index";
    }
}
