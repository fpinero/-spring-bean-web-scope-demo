package com.fpe.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpe.springdemo.service.RandomizerRequestScope;
import com.fpe.springdemo.service.RandomizerSessionScope;

@Controller
public class ScopeController {

	@Autowired
	RandomizerRequestScope randomizerRequestScope;

	@Autowired
	RandomizerSessionScope randomizerSessionScope;

	@RequestMapping("/")
	public String getRandom(Model model) {

		// recopila la data q necesitamos
		// WelcomeService welcomeService = new WelcomeService();
		int requestRandomNumber = randomizerRequestScope.getRamdonNumber();
		randomizerRequestScope.generateRandomNumbe();
		int requestRandomNumber2 = randomizerRequestScope.getRamdonNumber();
		Object requestReferenceId = randomizerRequestScope;
		
		int sessionRandomNumber = randomizerSessionScope.getRamdonNumber();
		randomizerSessionScope.generateRandomNumbe();
		int sessionRandomNumber2 = randomizerSessionScope.getRamdonNumber();
		Object sessionReferenceId = randomizerSessionScope;

		// añade la data al modelo
		model.addAttribute("requestRandomNumber", requestRandomNumber);
		model.addAttribute("requestRandomNumber2", requestRandomNumber2);
		model.addAttribute("requestReferenceId", requestReferenceId);
		
		model.addAttribute("sessionRandomNumber", sessionRandomNumber);
		model.addAttribute("sessionRandomNumber2", sessionRandomNumber2);
		model.addAttribute("sessionReferenceId", sessionReferenceId);

		// retorna el nombre de la vista a emplear (en este caso showRandomNumbers.jsp)
		return "showRandomNumbers";
	}

}
