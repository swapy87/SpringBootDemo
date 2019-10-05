package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Timepass {


	@GetMapping("/swapy")
	public String getTpMethod()
	{
		System.out.println("Nachooooooooooo");
		return "Swapnil ki jai ho";
	}
}
