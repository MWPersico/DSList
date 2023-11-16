package com.marcprojects.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcprojects.dslist.dto.GameListDTO;
import com.marcprojects.dslist.dto.GameMinDTO;
import com.marcprojects.dslist.services.GameListService;
import com.marcprojects.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	GameListService gameListService;
	@Autowired
	GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id){
		return gameListService.findById(id);
	}
	
	@GetMapping(value = "/{id}/games")
	public List <GameMinDTO> searchByList(@PathVariable Long id){
		return gameService.searchByList(id);
	}
}
