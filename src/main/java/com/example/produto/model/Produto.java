package com.example.produto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(length =  100, nullable = true)
    private String nome;

    @Column(length =  100, nullable = true)
    private String descricao;

    @Column(length =  100, nullable = true)
    private String fabricante;

    @Column(length =  1, nullable = true)
    private String Importada;

    private float precoMedio;

    private Integer quantidade;

    @Column(length =  100, nullable = true)
    private String PecasAutomotivas;
}