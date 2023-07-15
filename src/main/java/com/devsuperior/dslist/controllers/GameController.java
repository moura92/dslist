package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.antities.GameList;
import com.devsuperior.dslist.services.GameService;
import com.devsuperior.dslistdto.GameDTO;
import com.devsuperior.dslistdto.GameMinDTO;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameList findById(@PathVariable Long id){
		return gameService.findByID(id);
	}
	
	@GetMapping
	public List<GameMinDTO> finAll(){
		return gameService.findAll();
	}
	

}
