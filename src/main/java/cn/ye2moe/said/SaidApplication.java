package cn.ye2moe.said;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SaidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaidApplication.class, args);
	}
}
