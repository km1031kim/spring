package com.mycompany.mvcproject.controller;

import com.mycompany.mvcproject.service.EmailServiceClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/email")
public class EmailController {

    @RequestMapping("/email/sendEmail")
    @ResponseBody
    public String sendEmail() {
        EmailServiceClient emailServiceClient = new EmailServiceClient();
        return "Sucess";
    }
}
