package reservas.ufpb.reservas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReservasApplication {

	private  static final Logger log = LoggerFactory.getLogger(ReservasApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReservasApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Reserva reserva = restTemplate.getForObject(
					"http://localhost:8080/hoteis",Reserva.class);
			log.info(reserva.toString());
		};
	}
}
