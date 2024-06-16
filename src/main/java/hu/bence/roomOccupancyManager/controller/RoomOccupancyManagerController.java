package hu.bence.roomOccupancyManager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerRequest;
import hu.bence.roomOccupancyManager.dto.RoomOccupancyManagerResponse;
import hu.bence.roomOccupancyManager.manager.RoomOccupancyManager;

@RestController
public class RoomOccupancyManagerController {

	@GetMapping("/calculate")
	public RoomOccupancyManagerResponse calculate(@RequestParam int premium, @RequestParam int economy) {
		return RoomOccupancyManager.calculate(new RoomOccupancyManagerRequest(premium, economy));
	}

}
