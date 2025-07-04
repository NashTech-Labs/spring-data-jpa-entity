package com.nashtech.techhub.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Configuration class to enable JPA Auditing in the application.
 * This allows automatic population of auditing fields such as
 * createdTime and updatedTime in auditable entities.
 */
@Configuration
@EnableJpaAuditing
public class JpaConfig {
}
