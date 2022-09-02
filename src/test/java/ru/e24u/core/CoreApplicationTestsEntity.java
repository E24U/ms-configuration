package ru.e24u.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
@TestPropertySource(
    properties = {
        "spring.datasource.url = jdbc:tc:postgresql://localhost:5401/integration-tests-db",
        "spring.datasource.driver-class-name = org.testcontainers.jdbc.ContainerDatabaseDriver",
        "spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect"
    }
)
class CoreApplicationTestsEntity {

    @Container
    private PostgreSQLContainer postgresqlContainer = new PostgreSQLContainer()
        .withDatabaseName("foo")
        .withUsername("foo")
        .withPassword("secret");

    @Test
    void contextLoads() {
    }

}
