package com.example.produto.resource;

import com.example.produto.model.Produto;
import com.example.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class ProdutoController {
    ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity <Produto> inserir(@RequestBody Produto produto) {
        produtoService.cadastrarProduto(produto);

        return ResponseEntity.status(201).build();
    }
    
    @GetMapping("/listarTodos")
    public ResponseEntity <List<Produto>> listarTodos()
    {
        return ResponseEntity.ok(produtoService.listarTodos());
    }
    
    @GetMapping("/AcharProduto")
    public ResponseEntity <Produto> acharProduto(@RequestBody Produto produto)
    {
        produtoService.acharProduto(produto.getNome());
        return ResponseEntity.status(201).build();
    }

}
