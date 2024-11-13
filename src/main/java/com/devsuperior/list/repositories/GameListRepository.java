package com.devsuperior.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.list.entitites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
