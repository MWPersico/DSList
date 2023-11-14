package com.marcprojects.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository; //Classe padrão da JPA para objetos Repository, recebe parâmetros de tipo para a entidade e seu id
import com.marcprojects.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{}
//Classe 'GameRepository', declara os métodos básicos para consulta SQL, utiliza a JPA