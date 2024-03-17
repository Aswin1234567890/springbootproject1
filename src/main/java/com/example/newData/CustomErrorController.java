package com.example.newData;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Your custom error handling logic here
        return "error"; // Assuming you have an "error.html" template
    }

    public String getErrorPath() {
        return "/error";
    }
}
