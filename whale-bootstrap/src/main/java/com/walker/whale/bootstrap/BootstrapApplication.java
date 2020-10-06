package com.walker.whale.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author walker
 */
@SpringBootApplication(scanBasePackages = "com.walker.whale")
@EnableJpaRepositories(basePackages = "com.walker.whale.infrastructure.persistence.database.repository")
@EntityScan(basePackages = "com.walker.whale.infrastructure.persistence.database.entity")
public class BootstrapApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootstrapApplication.class, args);
  }

}
