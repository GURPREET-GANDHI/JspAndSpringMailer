package com.example.poc.jspdemo.util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class Mailler {

    public static final String RECIEVER_MAIL = "testap748@gmail.com";
    @Autowired
    JavaMailSender javaMailSender;


    public void sendMail(String msg) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(RECIEVER_MAIL);
        helper.setSubject("Testing from Spring Boot");
        // default = text/plain
        //helper.setText("Check attachment for image!");
        // true = text/html
        helper.setText(msg, false);
        message.setSubject("Text From Gru!!");
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(RECIEVER_MAIL));
        message.setContent(msg, "text/plain");
        javaMailSender.send(message);
    }

}
