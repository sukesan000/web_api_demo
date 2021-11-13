package com.example.springPractice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "dbcp2.jdbc")
@Data
public class DataSourceConfigurationProperties {
    private final String url;

    private final String driverClassName;

    private final String username;

    private final String password;

    private final int initialSize;

    private final int maxIdle;

    private final int minIdle;

    public DataSourceConfigurationProperties(String url, String driverClassName, String username, String password,
                                             int initialSize, int maxIdle, int minIdle) {
        this.url = url;
        this.driverClassName = driverClassName;
        this.username = username;
        this.password = password;
        this.initialSize = initialSize;
        this.maxIdle = maxIdle;
        this.minIdle = minIdle;
    }
}
