package com.devsuperior.dslist.projections;

public interface GameMinProjection {

    Long getId(); // Tem que colcar métodos get para cada dado que a consulta
    // no banco está retornando
    String getTitle();
    Integer getgameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
