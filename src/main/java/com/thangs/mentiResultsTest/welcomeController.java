package com.thangs.mentiResultsTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomeController {
    @RequestMapping("/mentiResultPage")
    public String loginMessage(){
        return "mentiResultPage.html";
    }
}
