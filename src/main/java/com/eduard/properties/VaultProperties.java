package com.eduard.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.vault.config.EnvironmentVaultConfiguration;

import lombok.Getter;

@Configuration
@PropertySource(value = {"classpath:vault.properties"})
@Import(value = EnvironmentVaultConfiguration.class)
@Scope("singleton")
@Getter
public class VaultProperties {
}