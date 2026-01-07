package com.andrade.email.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import com.andrade.email.enums.EmailStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "email_table")
public class Email {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID emailId;

    @Column(name = "user_id")
    private UUID userID;

    @Column(name = "receiver")
    private String emailTo;

    @Column(name = "sender")
    private String emailFrom;

    @Column(name = "subject")
    private String emailSubject;

    @Column(name = "message", columnDefinition="TEXT")
    private String emailBody;

    @Column(name = "send_time")
    private LocalDateTime sendTime;

    @Column(name = "status")
    private EmailStatus status;
}
