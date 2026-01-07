package com.andrade.email.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrade.email.domain.Email;

public interface  EmailRepository extends  JpaRepository<Email,UUID> {
    
}
