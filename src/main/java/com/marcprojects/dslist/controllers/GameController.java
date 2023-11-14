package com.marcprojects.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; //Injeção de dependências no objeto
import org.springframework.web.bind.annotation.GetMapping; //Identifica o método padrão para verbo GET HTTP
import org.springframework.web.bind.annotation.RequestMapping; // Mapeia e configura o end-point da API Rest
import org.springframework.web.bind.annotation.RestController; // RestController do Spring

import com.marcprojects.dslist.dto.GameMinDTO;
import com.marcprojects.dslist.services.GameService;

@RestController // Identifica a classe como um dos controladores Rest do sistema
@RequestMapping(value = "/games") // Configura o caminho da API
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
}
//Classe 'GameController', interface do back-end, controlador da API para servir dados de objetos 'Game' (DTOs de Game)