package com.devsuperior.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_belonging")
// Pertencimento, cada jogo pertence a qual list
public class Belonging {

    @EmbeddedId   // representa o campo que vai compor 2 chave primári
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging() {

    }

    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);// Belonging  tem a referencia do game e game list e ela é passada para o game PK
        id.setList(list);
        this.position = position;
    }
}
