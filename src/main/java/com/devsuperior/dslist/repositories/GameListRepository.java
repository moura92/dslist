package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.antities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	

	
}
