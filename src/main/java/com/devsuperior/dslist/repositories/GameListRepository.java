package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> { // Nome da entidade,Tipo do id da entidade (long


    @Modifying // quando é uma  modificação no banco tem que colocar o Modifyning
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    // a query acima pega as informações do objeto do id da lista e do id do gam e
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition); // faz a chamada do método

}