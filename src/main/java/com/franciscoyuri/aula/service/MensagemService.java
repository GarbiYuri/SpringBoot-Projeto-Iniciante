package com.franciscoyuri.aula.service;

import com.franciscoyuri.aula.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return  mensagemRepository.obterMensagem();
    }
}
