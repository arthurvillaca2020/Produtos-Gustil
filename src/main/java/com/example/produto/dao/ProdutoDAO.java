package com.example.produto.dao;

import com.example.produto.model.Produto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.Collection;

public interface ProdutoDAO extends JpaRepository<Produto, String> {

    public ArrayList<Produto> findByNome(String nome);


}