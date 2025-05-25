package com.projetoLista.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoLista.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
