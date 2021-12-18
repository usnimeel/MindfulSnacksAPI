package com.example.MindfulSnakcsAPI.snack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/snack")
public class SnackController {

    private final SnackService snackService;
    
    @Autowired
	public SnackController(SnackService snackService) {
        this.snackService = snackService;
    }

    @GetMapping
	public List<Snacks> getSnacks() {
		return snackService.getSnacks();
	}
}
