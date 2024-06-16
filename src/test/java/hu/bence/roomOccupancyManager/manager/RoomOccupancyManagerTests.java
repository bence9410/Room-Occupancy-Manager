package hu.bence.roomOccupancyManager.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerRequest;
import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerResponse;

public class RoomOccupancyManagerTests {

	@Test
	public void test1() {
		RoomOccupancyManagerResponse result = RoomOccupancyManager.calculate(new RoomOccupancyManagerRequest(3, 3));
		Assertions.assertEquals(738, result.getPremiumUsage());
		Assertions.assertEquals(167.99, result.getEconomyUsage());
	}

	@Test
	public void test2() {
		RoomOccupancyManagerResponse result = RoomOccupancyManager.calculate(new RoomOccupancyManagerRequest(7, 5));
		Assertions.assertEquals(1054, result.getPremiumUsage());
		Assertions.assertEquals(189.99, result.getEconomyUsage());
	}

	@Test
	public void test3() {
		RoomOccupancyManagerResponse result = RoomOccupancyManager.calculate(new RoomOccupancyManagerRequest(2, 7));
		Assertions.assertEquals(583, result.getPremiumUsage());
		Assertions.assertEquals(189.99, result.getEconomyUsage());
	}

	@Test
	public void test4() {
		RoomOccupancyManagerResponse result = RoomOccupancyManager.calculate(new RoomOccupancyManagerRequest(7, 1));
		Assertions.assertEquals(1153.99, result.getPremiumUsage());
		Assertions.assertEquals(45, result.getEconomyUsage());
	}
}
