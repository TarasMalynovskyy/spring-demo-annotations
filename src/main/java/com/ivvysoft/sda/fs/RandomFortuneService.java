package com.ivvysoft.sda.fs;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	Random random = new Random();
	String[] arr = { "RandomFortuneService 1", "RandomFortuneService 2", "RandomFortuneService 3" };

	@Override
	public String getFortune() {
		return arr[random.nextInt(arr.length)];
	}
}
