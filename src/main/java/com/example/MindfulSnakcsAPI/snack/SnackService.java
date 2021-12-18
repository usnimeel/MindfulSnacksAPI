package com.example.MindfulSnakcsAPI.snack;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SnackService {

    public List<Snacks> getSnacks() {
		return List.of(
			new Snacks(
				1L,
				"asd",
				12.2,
				"asd",
				"test"
			)
		);
	}
}
