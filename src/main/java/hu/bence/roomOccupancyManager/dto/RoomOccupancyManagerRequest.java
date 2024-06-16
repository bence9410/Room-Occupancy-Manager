package hu.bence.roomOccupancyManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomOccupancyManagerRequest {

	private int numberOfPremiumRooms;

	private int numberOfEconomyRooms;

}
