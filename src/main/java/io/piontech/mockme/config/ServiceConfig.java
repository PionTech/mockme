package io.piontech.mockme.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "io.piontech.mockme.account.service" })
public class ServiceConfig {
}
