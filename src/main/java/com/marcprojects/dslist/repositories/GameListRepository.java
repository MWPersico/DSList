package com.marcprojects.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marcprojects.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{}