package hu.bence.roomOccupancyManager.manager;

import java.util.Arrays;

import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerRequest;
import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerResponse;

public class RoomOccupancyManager {

	private static double[] GUESTS = new double[] { 23, 45, 155, 374, 22, 99.99, 100, 101, 115, 209 };

	static {
		Arrays.sort(GUESTS);
	}

	public static RoomOccupancyManagerResponse calculate(RoomOccupancyManagerRequest request) {
		return null;
	}
}
