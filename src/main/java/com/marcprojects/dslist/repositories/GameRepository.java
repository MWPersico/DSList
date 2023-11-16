package com.marcprojects.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; //Classe padrão da JPA para objetos Repository, recebe parâmetros de tipo para a entidade e seu id
import org.springframework.data.jpa.repository.Query; //Declara consulta costumizada SQL para método do Repository
import com.marcprojects.dslist.entities.Game;
import com.marcprojects.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	@Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.game_list_id = :listId
		ORDER BY tb_belonging.position
	""")
	public List<GameMinProjection> searchByList(Long listId);
}
//Classe 'GameRepository', declara os métodos básicos para consulta SQL, utiliza a JPA