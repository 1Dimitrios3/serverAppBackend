package io.fullstack.server;

import io.fullstack.server.enumeration.Status;
import io.fullstack.server.model.Server;
import io.fullstack.server.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			serverRepository.save(new Server(
					null,
					"192.168.2.1",
					"Ubuntu Linux",
					"16 GB",
					"Personal PC",
					"http://localhost:8080/server/image/server1.png",
					Status.SERVER_UP
				)
			);

			serverRepository.save(new Server(
							null,
							"192.168.2.2",
							"Fedora Linux",
							"16 GB",
							"Dell Tower",
							"http://localhost:8080/server/image/server2.png",
							Status.SERVER_UP
					)
			);

			serverRepository.save(new Server(
							null,
							"192.161.1.21",
							"MS 2008",
							"32 GB",
							"Web Server",
							"http://localhost:8080/server/image/server3.png",
							Status.SERVER_UP
					)
			);

			serverRepository.save(new Server(
							null,
							"192.161.1.14",
							"Red Hat Linux",
							"64 GB",
							"Mail Server",
							"http://localhost:8080/server/image/server4.png",
							Status.SERVER_DOWN
					)
			);
		};
	}

}
