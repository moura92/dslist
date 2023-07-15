package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.antities.Game;
import com.devsuperior.dslist.antities.GameList;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslistdto.GameDTO;
import com.devsuperior.dslistdto.GameMinDTO;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameList findByID(Long id) {
		return gameRepository.findById(id).get();
	}
	
	public List<GameMinDTO> findAll(){
		List<GameList> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO()).toList();
	}
}
