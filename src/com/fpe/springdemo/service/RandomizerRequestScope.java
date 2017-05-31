package com.fpe.springdemo.service;

public class RandomizerRequestScope {

	private int randomNumber = 5;
	
	public int getRamdonNumber() {
		return randomNumber;
	}
	
	public void generateRandomNumbe() {
		this.randomNumber = (int) (Math.random() * 99999);
		System.out.println("Request scope generado nuevo numero aleatorio :" + randomNumber);
	}
	
}
