package com.fpe.springdemo.service;

public class RandomizerSessionScope {

	private int randomNumber = 10;
	
	public int getRamdonNumber() {
		return randomNumber;
	}
	
	public void generateRandomNumbe() {
		this.randomNumber = (int) (Math.random() * 99999);
		System.out.println("Session scope generado nuevo numero aleatorio :" + randomNumber);
	}
	
}
