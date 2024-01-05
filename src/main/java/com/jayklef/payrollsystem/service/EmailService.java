package com.jayklef.payrollsystem.service;

import com.jayklef.payrollsystem.dto.EmailDetails;

public interface EmailService {

    void sendEmail(EmailDetails emailDetails);

    void sendEmailWithAttachment(EmailDetails emailDetails);
}
