package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.antities.GameList;

public interface GameRepository extends JpaRepository<GameList, Long> {
	

	
}
