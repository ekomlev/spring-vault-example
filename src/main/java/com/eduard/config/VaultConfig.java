package com.eduard.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.vault.annotation.VaultPropertySource;

import com.eduard.pojo.UserCredentials;
import com.eduard.properties.VaultProperties;

import static com.eduard.enums.Credentials.PASSWORD;
import static com.eduard.enums.Credentials.USERNAME;

@Configuration
@Import(VaultProperties.class)
@VaultPropertySource("secret/path")
public class VaultConfig {

  @Autowired
  Environment env;

  @Bean
  @Primary
  public UserCredentials credentials() {
    UserCredentials credentials = new UserCredentials();
    credentials.setUsername(env.getProperty(USERNAME.getValue()));
    credentials.setPassword(env.getProperty(PASSWORD.getValue()));

    return credentials;
  }
}