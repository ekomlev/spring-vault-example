package com.eduard.pojo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserCredentials {
  private String username;
  private String password;
}