package com.marcprojects.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; //Injeção de dependências no objeto
import org.springframework.stereotype.Service; //Identifica o objeto como componente do sistema, para gerenciamento (pode ser @Component)
import com.marcprojects.dslist.dto.GameMinDTO;
import com.marcprojects.dslist.entities.Game;
import com.marcprojects.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList(); //Gera uma lista de objetos 'GameMinDTO' apartir de um stream da lista de objetos 'Game', utilizando map e o método new de GameMinDTO
	}
}
//Classe 'GameService', inclui a lógica de negócio para os objetos 'Game'