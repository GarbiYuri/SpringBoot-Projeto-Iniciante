package com.franciscoyuri.aula.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String obterMensagem(){
        return "Olá Do Repositório";
    }
}
