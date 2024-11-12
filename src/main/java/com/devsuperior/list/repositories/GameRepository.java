package com.devsuperior.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.list.entitites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
