package com.marcprojects.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; //Injeção de dependências no objeto
import org.springframework.stereotype.Service; //Identifica o objeto como componente do sistema, para gerenciamento (pode ser @Component)
import org.springframework.transaction.annotation.Transactional; //Garante que a operação ocorra obedecendo aos príncipios das transações (ACID) 'boas práticas'
import org.springframework.web.bind.annotation.RequestParam;
import com.marcprojects.dslist.dto.GameDTO;
import com.marcprojects.dslist.dto.GameMinDTO;
import com.marcprojects.dslist.entities.Game;
import com.marcprojects.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true) //Declara que serão realizadas apenas operações de leituras no banco de dados
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDTO::new).toList(); //Gera uma lista de objetos 'GameMinDTO' apartir de um stream da lista de objetos 'Game', utilizando map e o método new de GameMinDTO
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(@RequestParam Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
}
//Classe 'GameService', inclui a lógica de negócio para os objetos 'Game'