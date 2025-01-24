package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> { // Nome da entidade,Tipo do id da entidade (long


    // Consulta SQL é sempre no repository, nativequery é o SQL padrão
    // o JPQUERY é outra linguagem de consulta da JPA
    @Query(nativeQuery = true, value = """ 
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<GameMinProjection> searchByList(Long listId); // Search você coloca o parâmetro
    // que você vai passar pra sua lista de vez  colocar o valor no where

    //Quando você faz uma consulta nativa
    // o retorno tem que ter uma interface no caso criamos a GameMinProjection

}