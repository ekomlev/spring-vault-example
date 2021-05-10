package com.eduard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Credentials {
  USERNAME("username"),
  PASSWORD("password");

  private final String value;
}