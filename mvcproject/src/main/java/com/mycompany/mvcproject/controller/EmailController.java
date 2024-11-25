package com.mycompany.mvcproject.controller;

import com.mycompany.mvcproject.domain.SendEmailRequest;
import com.mycompany.mvcproject.service.EmailServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/email")
public class EmailController {

   private final EmailServiceClient emailServiceClient;

   @Autowired
    public EmailController(EmailServiceClient emailServiceClient) {
        this.emailServiceClient = emailServiceClient;
    }

    @RequestMapping("/sendEmail")
    @ResponseBody
    public String sendEmail() {
       // EmailServiceClient emailServiceClient = new EmailServiceClient(); // 이렇게 쓰면 안된다. 상위 객체로 넘겨야 한다.
        SendEmailRequest sendEmailRequest = generateEmailRequest(); // 비어있는 객체
        emailServiceClient.sendEmail(sendEmailRequest);
        return "Sucess";
    }


    public SendEmailRequest generateEmailRequest() {
        // 간단한 이메일 요청 객체 생성
        SendEmailRequest request = new SendEmailRequest();
        request.setToAddress("test@example.com");
        request.setSubject("test subject");
        request.setBody("This is a test email");
        return request;
    }
}
