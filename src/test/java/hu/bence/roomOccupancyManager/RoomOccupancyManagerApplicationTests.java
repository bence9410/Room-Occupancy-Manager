package hu.bence.roomOccupancyManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerResponse;
import jakarta.annotation.PostConstruct;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RoomOccupancyManagerApplicationTests {

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	@LocalServerPort
	private int port;

	private RestTemplate restTemplate;

	@PostConstruct
	public void setUp() {
		restTemplate = restTemplateBuilder.build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void apiWorks() {
		ResponseEntity<RoomOccupancyManagerResponse> resp = restTemplate.getForEntity(
				"http://localhost:" + port + "/calculate?premium=3&economy=3", RoomOccupancyManagerResponse.class);
		RoomOccupancyManagerResponse result = resp.getBody();
		Assertions.assertEquals(738, result.getPremiumUsage());
		Assertions.assertEquals(167.99, result.getEconomyUsage());
	}

}
