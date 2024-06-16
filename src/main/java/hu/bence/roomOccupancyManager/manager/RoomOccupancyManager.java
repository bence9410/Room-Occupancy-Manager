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
		int premiumRooms = request.getNumberOfPremiumRooms();
		int economyRooms = request.getNumberOfEconomyRooms();
		double premium = 0;
		int i = GUESTS.length - 1;
		while (i > 0 && premiumRooms > 0 && GUESTS[i] >= 100) {
			premium += GUESTS[i--];
			premiumRooms--;
		}
		while (i >= 0 && economyRooms < i + 1 && premiumRooms > 0) {
			premium += GUESTS[i--];
			premiumRooms--;
		}
		double economy = 0;
		while (i >= 0 && economyRooms > 0) {
			while (GUESTS[i] >= 100) {
				i--;
			}
			economy += GUESTS[i--];
			economyRooms--;
		}
		return new RoomOccupancyManagerResponse(premium, economy);
	}
}
