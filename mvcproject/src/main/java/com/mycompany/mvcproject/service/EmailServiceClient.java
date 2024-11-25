package com.mycompany.mvcproject.service;

import com.mycompany.mvcproject.domain.SendEmailRequest;

public class EmailServiceClient {

    public void sendEmail(SendEmailRequest request) {

        // 실제 이메일 발송 로직
        System.out.println("Sending Email to : " + request.getToAddress());
        System.out.println("Subject :  " + request.getSubject());
        System.out.println("Body : " + request.getBody());
    }
}
