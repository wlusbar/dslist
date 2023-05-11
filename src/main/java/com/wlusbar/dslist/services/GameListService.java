package com.wlusbar.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlusbar.dslist.dto.GameListDTO;
import com.wlusbar.dslist.dto.GameMinDTO;
import com.wlusbar.dslist.entities.GameList;
import com.wlusbar.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll(){
		 List<GameList> result = gameListRepository.findAll();
		 List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();		
		 return dto;
	}
	
}
