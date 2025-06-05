package com.sistdist.diploma_generator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@DataJpaTest
@TestPropertySource(properties = {
		"spring.test.database.replace=none",
		"spring.datasource.url=jdbc:tc:postgresql:///db"
})
class DiplomaGeneratorApplicationIT {

	@Test
	void contextLoads() {
	}

}
