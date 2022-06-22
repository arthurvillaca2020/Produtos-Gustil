package com.example.produto.service;

import com.example.produto.dao.ProdutoDAO;
import com.example.produto.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoDAO.save(produto);
    }
    
    public List<Produto> listarTodos()
    {
        return produtoDAO.findAll();
    }
    
    public List<Produto> acharProduto(String nome)
    {
        return produtoDAO.findByNome(nome);
    }

}
