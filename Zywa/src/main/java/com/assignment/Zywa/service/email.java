package com.assignment.Zywa.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ssl.SslProperties;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@Slf4j

public interface email {
    EmailDetails emailDetails = EmailDetails.builder()
            .recipent(user.email()).
            subject("Statement of Acc")
            .messageBody("Kindly find your requested account statement attached")
            .attachement(File)
            .build();

    email.sendEmailWithAttachment(emailDetails);
}
