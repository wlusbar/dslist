package com.wlusbar.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wlusbar.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{

}
