package hu.bence.roomOccupancyManager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomOccupancyManagerResponse {

	private double premiumUsage;

	private double economyUsage;

}
