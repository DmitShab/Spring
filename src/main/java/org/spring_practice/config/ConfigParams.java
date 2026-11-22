package org.spring_practice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigParams {
    @Value("${services.service1.api}")
    public String postHost;
}
