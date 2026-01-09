package com.andrade.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.andrade.user.dto.UserDto;

@RequestMapping("api/v1/createUsers")
public class UserController {

    @PostMapping("/")
    public ResponseEntity<HttpStatus> createUser(@RequestBody UserDto user ){
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

  

