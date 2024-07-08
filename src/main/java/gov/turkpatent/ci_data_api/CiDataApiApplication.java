package gov.turkpatent.ci_data_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })public class CiDataApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiDataApiApplication.class, args);
	}

}
