package com.franciscoyuri.aula.service;

import com.franciscoyuri.aula.entitys.Produto;
import com.franciscoyuri.aula.exception.RecursoNaoEncontradoException;
import com.franciscoyuri.aula.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return  produtoRepository.findAll();
    }
    public Produto buscarPorId(Long id){
        return  produtoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Produto com id"+id+"Não encontrado"));
    }
    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
    public  void deletarProduto(Long id){
        if (!produtoRepository.existsById(id)){
            throw new RecursoNaoEncontradoException("Produto com id"+id+"Não encontrado");
        }
        produtoRepository.deleteById(id);
    }

}
