package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {

    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
    // Nesse caso acima, poderiamos utilizar o BeanUtil também
    // mas como é poco atributo n foi necessário
    // como n usamo o Bean util só precisa colocar o get o set não precis

     public Long getId() {
        return id;
     }
     public String getName() {
        return name;
     }

}
