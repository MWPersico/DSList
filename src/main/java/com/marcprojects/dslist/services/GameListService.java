package com.marcprojects.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcprojects.dslist.dto.GameListDTO;
import com.marcprojects.dslist.entities.GameList;
import com.marcprojects.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public GameListDTO findById(Long id){
		GameList result = gameListRepository.findById(id).get();
		return new GameListDTO(result);
	}
}
