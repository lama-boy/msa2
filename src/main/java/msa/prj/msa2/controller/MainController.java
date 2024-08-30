package msa.prj.msa2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "index";
    }
    

}
